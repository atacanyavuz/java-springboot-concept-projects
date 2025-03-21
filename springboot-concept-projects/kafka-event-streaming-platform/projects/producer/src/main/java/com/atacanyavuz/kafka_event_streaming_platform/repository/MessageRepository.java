package com.atacanyavuz.kafka_event_streaming_platform.repository;

import com.atacanyavuz.kafka_event_streaming_platform.repository.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
