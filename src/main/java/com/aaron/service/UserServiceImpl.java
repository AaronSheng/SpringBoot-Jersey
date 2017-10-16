package com.aaron.service;

import com.aaron.exception.BadRequestException;
import com.aaron.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by Aaron Sheng on 2017/10/8.
 */
@Service
public class UserServiceImpl implements UserService {
    public User get(Long userId) {
        throw new BadRequestException("delete");
    }

    @Override
    public void delete(Long userId) {
        throw new BadRequestException("delete");
    }

    @Override
    public void update(Long userId, String name) {

    }
}
