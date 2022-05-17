package com.kafkamongo.project.controller;

import com.kafkamongo.project.model.Data;
import com.kafkamongo.project.repository.TestKafkaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {
    
    @Autowired
    KafkaTemplate <String, Data> kafka;

    public static final String TOPIC = "kafka-topic-mongodb";

    @Autowired
    private TestKafkaRepository testKafkaRepository;

    @PostMapping("/kafka/send-message")
    public ResponseEntity<Object> dataMessage(@RequestBody Data message) {

        Data sendMessage = new Data();
        sendMessage.setMessage(message.toString());
        Data getData = this.testKafkaRepository.save(message);

        kafka.send(TOPIC, getData);

        return new ResponseEntity<Object>("Publish Successfully...", HttpStatus.OK);
    }

}
