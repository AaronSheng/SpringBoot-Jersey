package com.aaron.exception;

/**
 * Created by Aaron Sheng on 2017/10/15.
 */
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
