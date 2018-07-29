package com.aaron.service;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Aaron Sheng on 2018/7/16.
 */
public class AuthServiceTest {
    @Test
    public void testGet() {
        AuthService authService = new AuthServiceImpl();
        authService.get(1L);
    }
}
