package com.example.kafka_msg;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer producer;

    @PostMapping("/publish")
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "Message sent to Kafka: " + message;
    }
}