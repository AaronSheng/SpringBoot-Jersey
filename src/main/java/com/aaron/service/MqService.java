package com.aaron.service;

import com.aaron.api.pojo.Message;

/**
 * Created by Aaron Sheng on 2018/7/29.
 */
public interface MqService {
    void create(Long userId, Message message);
}
