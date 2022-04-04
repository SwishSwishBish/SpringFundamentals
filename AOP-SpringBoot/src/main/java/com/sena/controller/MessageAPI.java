package com.sena.controller;

import com.sena.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageAPI {

    private final MessageService messageService;

    public MessageAPI(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public ResponseEntity<String> exampleMethod(@RequestBody String message) {
        return ResponseEntity.ok(messageService.sendMessage(message));
    }
}