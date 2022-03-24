package com.sena.controller;

import com.sena.entity.User;
import com.sena.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserAPI {
    private final UserRepository userRepository;

    public UserAPI(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @PostConstruct
//    public void init() {
//        User user = new User();
//        user.setName("Sena");
//        user.setLastname("Deneme");
//        userRepository.save(user);
//    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> see() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
