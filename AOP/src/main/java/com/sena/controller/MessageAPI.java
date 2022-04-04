package com.sena.controller;

import com.sena.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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