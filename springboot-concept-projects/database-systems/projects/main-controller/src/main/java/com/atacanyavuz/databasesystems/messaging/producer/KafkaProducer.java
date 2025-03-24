package com.atacanyavuz.databasesystems.messaging.producer;

import com.atacanyavuz.databasesystems.messaging.event.BroadcastEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String, BroadcastEvent> kafkaTemplate;

    public void broadcastMessage(BroadcastEvent broadcastEvent){
        Message<BroadcastEvent> message = MessageBuilder
                .withPayload(broadcastEvent)
                .setHeader(KafkaHeaders.TOPIC, "main-topic")
                .build();
        kafkaTemplate.send(message);
    }
}
