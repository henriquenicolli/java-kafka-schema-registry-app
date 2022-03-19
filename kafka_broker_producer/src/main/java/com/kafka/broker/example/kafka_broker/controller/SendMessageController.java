package com.kafka.broker.example.kafka_broker.controller;

import com.kafka.broker.example.kafka_broker.producer.TestekafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    private TestekafkaProducer testekafkaProducer;

    @GetMapping("/send")
    public void sendMessage(){
        System.out.println("Sendding message..");

        testekafkaProducer.sendMessage("message");

        System.out.println("Mensagem enviada..");
    }

}
