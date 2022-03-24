package com.sena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /*
        swagger ui -> localhost:8080/swagger-ui.html
        swagger documents -> localhost:8080/v2/api-docs
         */
        SpringApplication.run(Application.class, args);
    }
}
