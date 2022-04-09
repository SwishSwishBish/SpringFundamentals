package com.sena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    //throws an error when there is no recorded data
    //http://localhost:8080/test
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
