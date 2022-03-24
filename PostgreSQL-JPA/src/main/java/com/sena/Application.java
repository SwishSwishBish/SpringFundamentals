package com.sena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /* for testing
    Port:http://localhost:8080/person
    Post -> Body
    raw-JSON:

    {
    "name":"Limon",
    "lastname":"Man",
    "addresses":["Test address","Test address 2"]
    }
     */
}