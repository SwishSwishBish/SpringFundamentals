package com.sena.flyway.controller;

import com.sena.flyway.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private IUserRepository userRepository;

    @GetMapping
    public List<?> getAll() {
        return userRepository.findAll();
    }
}
