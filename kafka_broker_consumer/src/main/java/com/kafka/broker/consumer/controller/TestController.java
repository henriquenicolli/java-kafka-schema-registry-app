package com.kafka.broker.consumer.controller;

import com.kafka.broker.consumer.consumer.StringMessageKafkaConsumer;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class TestController {
    private final StringMessageKafkaConsumer consumer;

    @GetMapping("/get/string")
    public ResponseEntity<String> sendStringMessage(){
        System.out.println("get last message..");

        var lastMessage = consumer.getLastMessage("topico_teste_1");

        return ResponseEntity.ok(lastMessage);
    }

}
