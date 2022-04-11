package com.sena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    //http://localhost:8080/h2-console
    //http://localhost:8080/books/pagination?page=10&pageSize=5
    //http://localhost:8080/books/pageable?page=10&pageSize=5
    //http://localhost:8080/books/slice?page=10&pageSize=5
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
