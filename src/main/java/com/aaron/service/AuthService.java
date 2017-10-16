package com.aaron.service;

import com.aaron.pojo.Auth;

/**
 * Created by Aaron Sheng on 2017/10/14.
 */
public interface AuthService {
    Auth get(Long userId);

    void delete(Long userId);
}
