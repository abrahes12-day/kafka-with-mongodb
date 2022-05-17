package com.kafkamongo.project.repository;

import com.kafkamongo.project.model.Data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestKafkaRepository extends MongoRepository<Data, String>{
    @SuppressWarnings("unchecked")
    Data save(Data request);

}
