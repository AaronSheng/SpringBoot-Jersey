package com.aaron.service;

import com.aaron.pojo.Auth;
import org.springframework.stereotype.Service;

/**
 * Created by Aaron Sheng on 2017/10/14.
 */
@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public Auth get(Long userId) {
        return new Auth(userId, "ticket");
    }

    @Override
    public void delete(Long userId) {
    }
}
