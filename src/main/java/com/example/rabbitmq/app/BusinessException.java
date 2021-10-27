package com.example.rabbitmq.app;

public class BusinessException extends Exception{
    public BusinessException(String message) {
        super(message);
    }
}
