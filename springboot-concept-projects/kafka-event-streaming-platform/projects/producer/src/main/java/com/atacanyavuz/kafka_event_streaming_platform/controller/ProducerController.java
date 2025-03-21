package com.atacanyavuz.kafka_event_streaming_platform.controller;

import com.atacanyavuz.kafka_event_streaming_platform.controller.dto.ProducerRequest;
import com.atacanyavuz.kafka_event_streaming_platform.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ProducerController {
    private final ProducerService service;

    @PostMapping
    public ResponseEntity<Void> sendMessage(
            @RequestBody ProducerRequest request
            ){
        return ResponseEntity.ok(service.sendMessage((request)));
    }


}
