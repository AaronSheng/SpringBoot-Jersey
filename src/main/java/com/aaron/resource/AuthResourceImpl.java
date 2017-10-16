package com.aaron.resource;

import com.aaron.annotation.RestResource;
import com.aaron.api.AuthResource;
import com.aaron.exception.NotFoundException;
import com.aaron.pojo.Auth;
import com.aaron.pojo.Result;
import com.aaron.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Aaron Sheng on 2017/10/15.
 */
@RestResource
public class AuthResourceImpl implements AuthResource {
    @Autowired
    private AuthService authService;

    @Override
    public Result<Auth> get(Long userId) {
        return new Result<Auth>(authService.get(userId));
    }

    @Override
    public Result<Boolean> delete(Long userId) {
        throw new NotFoundException("未找到的资源");
    }
}
