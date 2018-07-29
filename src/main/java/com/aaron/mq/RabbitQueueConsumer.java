package com.aaron.mq;

import com.aaron.api.pojo.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Aaron Sheng on 2018/7/29.
 */
@Component
public class RabbitQueueConsumer {
    @RabbitListener(queues = "hello")
    public void consume(Message message) {
        System.out.println(message);
    }
}
