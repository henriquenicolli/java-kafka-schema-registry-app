package com.kafka.broker.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StringMessageKafkaConsumer {

    @KafkaListener(topics = "${topic-string-name}", groupId = "${group_id}")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}
