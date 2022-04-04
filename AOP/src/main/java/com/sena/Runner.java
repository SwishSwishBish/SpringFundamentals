package com.sena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Runner {
    //Aspect Oriented Programming
    //Post body -> localhost:8080/message
    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }
}
