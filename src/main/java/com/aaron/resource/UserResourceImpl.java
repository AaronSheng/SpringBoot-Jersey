package com.aaron.resource;

import com.aaron.annotation.RestResource;
import com.aaron.api.UserResource;
import com.aaron.exception.BadRequestException;
import com.aaron.pojo.Result;
import com.aaron.pojo.User;
import com.aaron.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Aaron Sheng on 2017/10/8.
 */
@RestResource
public class UserResourceImpl implements UserResource {
    @Autowired
    private UserService userService;

    public Result<User> get(Long userId) {
        return new Result<User>(userService.get(userId));
    }

    @Override
    public Result<Boolean> delete(Long userId) {
        throw new BadRequestException("没有权限");
    }
}
