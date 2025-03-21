package com.atacanyavuz.kafka_event_streaming_platform.messaging.producer;

import com.atacanyavuz.kafka_event_streaming_platform.messaging.event.MessageEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String, MessageEvent> kafkaTemplate;

    public void sendMessage(MessageEvent messageEvent){
        Message<MessageEvent> message = MessageBuilder
                .withPayload(messageEvent)
                .setHeader(KafkaHeaders.TOPIC, "example-topic")
                .build();
        kafkaTemplate.send(message);
    }
}
