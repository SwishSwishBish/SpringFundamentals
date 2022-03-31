package com.sena.rabbitmq;

import com.sena.rabbitmq.model.Notification;
import com.sena.rabbitmq.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class RabbitMqApplication {

    @Value("${sr.rabbit.routing.name}")
    String routingName;

    public RabbitMqApplication(NotificationProducer notificationProducer) {
        this.notificationProducer = notificationProducer;
    }

    @PostConstruct
    public void init(){
        Notification notification = new Notification();
        notification.setNotificationId(UUID.randomUUID().toString());
        notification.setCreateDate(new Date());
        notification.setMessage("Welcome!");
        notification.setSeen(Boolean.FALSE);

        notificationProducer.sendToQueue(notification);
    }
    private final NotificationProducer notificationProducer;

    public static void main(String[] args) {SpringApplication.run(RabbitMqApplication.class, args);}

}
