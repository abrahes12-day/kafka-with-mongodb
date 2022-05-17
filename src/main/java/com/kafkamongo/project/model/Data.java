package com.kafkamongo.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "testKafka")
public class Data {
    
    @Id
    private String id;
    private String message;    

}
