package com.aaron.service;

import com.aaron.api.pojo.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aaron Sheng on 2018/7/29.
 */
@Service
public class MqServiceImpl implements MqService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void create(Long userId, Message message) {
        rabbitTemplate.convertAndSend("hello", message);
    }
}
