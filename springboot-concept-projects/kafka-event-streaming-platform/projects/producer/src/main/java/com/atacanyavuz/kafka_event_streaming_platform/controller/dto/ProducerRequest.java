package com.atacanyavuz.kafka_event_streaming_platform.controller.dto;

public record ProducerRequest(
        String header,
        String body
) {
}
