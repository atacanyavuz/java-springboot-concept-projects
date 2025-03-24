package com.atacanyavuz.databasesystems.repository;

import com.atacanyavuz.databasesystems.repository.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
    Message findByDefiner(Integer id);
    void deleteByDefiner(Integer id);
}
