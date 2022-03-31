package com.sena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //http://localhost:8080/message
        //docker run -p 8080:8080 dockerization
        SpringApplication.run(Application.class, args);
    }
}
