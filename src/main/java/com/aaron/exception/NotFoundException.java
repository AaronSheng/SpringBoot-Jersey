package com.aaron.exception;

/**
 * Created by Aaron Sheng on 2017/10/15.
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String messgage) {
        super(messgage);
    }
}
