package com.atacanyavuz.kafka_event_streaming_platform.service;

import com.atacanyavuz.kafka_event_streaming_platform.controller.dto.ProducerRequest;
import com.atacanyavuz.kafka_event_streaming_platform.messaging.event.MessageEvent;
import com.atacanyavuz.kafka_event_streaming_platform.messaging.producer.KafkaProducer;
import com.atacanyavuz.kafka_event_streaming_platform.repository.MessageRepository;
import com.atacanyavuz.kafka_event_streaming_platform.repository.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {
    private final KafkaProducer kafkaProducer;
    private final MessageRepository repository;

    public Void sendMessage(ProducerRequest request) {
        kafkaProducer.sendMessage(
                new MessageEvent(
                        request.header(),
                        request.body()
                )
        );

        repository.save(Message
                .builder()
                .header(request.header())
                .body(request.body())
                .build());

        return null;
    }
}
