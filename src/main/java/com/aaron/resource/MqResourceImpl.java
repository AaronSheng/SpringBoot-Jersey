package com.aaron.resource;

import com.aaron.annotation.RestResource;
import com.aaron.api.MqResource;
import com.aaron.api.pojo.Message;
import com.aaron.pojo.Result;
import com.aaron.service.MqService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Aaron Sheng on 2018/7/29.
 */
@RestResource
public class MqResourceImpl implements MqResource {
    @Autowired
    private MqService mqService;

    @Override
    public Result<Boolean> create(Long userId, Message message) {
        mqService.create(userId, message);
        return new Result(true);
    }
}
