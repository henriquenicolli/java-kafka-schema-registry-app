package com.kafka.broker.example.kafka_broker.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StringMessageKafkaConsumer {

    @KafkaListener(topics = "topico_teste_1", groupId = "meu_grupo_id")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}
