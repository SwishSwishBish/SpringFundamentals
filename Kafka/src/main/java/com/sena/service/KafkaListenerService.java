package com.sena.service;

import com.sena.dto.KafkaMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaListenerService {

    @KafkaListener(
            topics = "${kafka.topic}",
            groupId = "${kafka.group.id}"
    )
    public void listen(@Payload KafkaMessage message) {
        log.info("Message received.. MessageID : {} Message: {} Date : {}",
                message.getId(),
                message.getMessage(),
                message.getMessageDate());
    }
}