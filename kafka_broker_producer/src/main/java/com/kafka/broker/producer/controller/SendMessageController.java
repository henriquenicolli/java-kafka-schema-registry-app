package com.kafka.broker.producer.controller;

import com.kafka.broker.producer.producer.AvroMessageProducer;
import com.kafka.broker.producer.producer.StringMessagekafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    private StringMessagekafkaProducer stringMessagekafkaProducer;

    @Autowired
    private AvroMessageProducer avroMessageProducer;

    @GetMapping("/send/string")
    public void sendStringMessage(){
        System.out.println("Sendding message..");

        for(int i = 0; i <= 100000; i++) {
            stringMessagekafkaProducer.sendMessage("message ->" + i);
        }
    }

    @GetMapping("/send/avro")
    public void sendAvroMessage(){
        System.out.println("Sendding message..");

        for(int i = 0; i <= 100000; i++) {
            avroMessageProducer.sendAvro();
        }
    }

}
