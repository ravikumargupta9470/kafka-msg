package com.example.kafka_msg;



import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "my-group1")
    public void consumer1(String message) {
        System.out.println("Received i am consumer 1: " + message);
    }

    @KafkaListener(topics = "test-topic" ,groupId="my-group2")
    public void consumer2(String msg)
    {
        System.out.println("Received i am consumer 2: " + msg);
    }

}