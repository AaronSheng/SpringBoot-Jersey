package com.aaron.service;

import com.aaron.pojo.User;

/**
 * Created by Aaron Sheng on 2017/10/8.
 */
public interface UserService {
    User get(Long userId);

    void delete(Long userId);

    void update(Long userId, String name);
}
