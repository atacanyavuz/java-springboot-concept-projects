package com.atacanyavuz.kafka_event_streaming_platform.messaging.consumers;

import com.atacanyavuz.kafka_event_streaming_platform.messaging.event.MessageEvent;
import com.atacanyavuz.kafka_event_streaming_platform.repository.MessageRepository;
import com.atacanyavuz.kafka_event_streaming_platform.repository.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageConsumer {
    private final MessageRepository repository;

    @KafkaListener(topics = "example-topic")
    public void saveMessage(MessageEvent messageEvent) throws MessagingException {
        repository.save(Message
                .builder()
                .header(messageEvent.header())
                .body(messageEvent.body())
                .build()
        );
    }
}
