package com.kafkamongo.project.listener;

import com.kafkamongo.project.model.Data;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {
    @KafkaListener(topics = "kafka-topic-mongodb", groupId = "group_json",
    containerFactory = "KafkaListenerFactory")
    
    public void consume(Data kafka) {
        System.out.println("Consumed message: " + kafka.getMessage());
    }
}
