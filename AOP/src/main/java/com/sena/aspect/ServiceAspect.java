package com.sena.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component // important!
public class ServiceAspect {

    @Before("execution(* com.sena.service.MessageService.sendMessage(..))")
    public void sendMessageBefore(JoinPoint joinPoint) {
        System.out.println("@Before : " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.sena.service.MessageService.sendMessage(..))")
    public void sendMessageAfter(JoinPoint joinPoint) {
        System.out.println("@After : " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}