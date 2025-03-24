package com.atacanyavuz.databasesystems.messaging.consumer;

import com.atacanyavuz.databasesystems.messaging.enums.OperationType;
import com.atacanyavuz.databasesystems.messaging.event.MessageEvent;
import com.atacanyavuz.databasesystems.repository.MessageRepository;
import com.atacanyavuz.databasesystems.repository.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Consumer {
    private final MessageRepository repository;

    @KafkaListener(topics = "main-topic")
    public void getMessage(MessageEvent messageEvent) throws MessagingException {
        if (messageEvent.op() == OperationType.CREATE){
            repository.save(Message
                    .builder()
                    .val1(messageEvent.val1())
                    .val2(messageEvent.val2())
                    .build()
            );
        }

        else if (messageEvent.op() == OperationType.UPDATE){
            Message message = repository.findById(messageEvent.id()).orElseThrow();
            message.setVal1(messageEvent.val1());
            message.setVal2(messageEvent.val2());
            repository.save(message);
        }

        else if (messageEvent.op() == OperationType.DELETE){
            repository.deleteById(messageEvent.id());
        }
    }
}
