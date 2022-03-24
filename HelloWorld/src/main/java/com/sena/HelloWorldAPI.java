package com.sena;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class HelloWorldAPI {
    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

}
