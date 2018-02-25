package com.xoxoms.exception;

/**
 * Created by ms on 2018. 2. 25..
 */
public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}
