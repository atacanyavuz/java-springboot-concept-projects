package com.atacanyavuz.databasesystems.service;

import com.atacanyavuz.databasesystems.controller.dto.CreateRequest;
import com.atacanyavuz.databasesystems.controller.dto.DeleteRequest;
import com.atacanyavuz.databasesystems.controller.dto.UpdateRequest;
import com.atacanyavuz.databasesystems.enums.OperationType;
import com.atacanyavuz.databasesystems.messaging.event.BroadcastEvent;
import com.atacanyavuz.databasesystems.messaging.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DatabaseSystemsMainService {
    private final KafkaProducer kafkaProducer;

    public Void broadcastMessageCreate(CreateRequest request) {
        kafkaProducer.broadcastMessage(
                new BroadcastEvent(
                        OperationType.CREATE,
                        request.id(),
                        request.val1(),
                        request.val2()
                )
        );
        return null;
    }

    public Void broadcastMessageUpdate(UpdateRequest request) {
        kafkaProducer.broadcastMessage(
                new BroadcastEvent(
                        OperationType.UPDATE,
                        request.id(),
                        request.val1(),
                        request.val2()
                )
        );
        return null;
    }

    public Void broadcastMessageDelete(DeleteRequest request) {
        kafkaProducer.broadcastMessage(
                new BroadcastEvent(
                        OperationType.DELETE,
                        request.id(),
                        null,
                        null
                )
        );
        return null;
    }
}
