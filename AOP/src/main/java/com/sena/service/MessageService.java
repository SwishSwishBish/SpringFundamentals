package com.sena.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String sendMessage(String message) {
        System.out.println("in-method :" + message);
        return message;
    }
}