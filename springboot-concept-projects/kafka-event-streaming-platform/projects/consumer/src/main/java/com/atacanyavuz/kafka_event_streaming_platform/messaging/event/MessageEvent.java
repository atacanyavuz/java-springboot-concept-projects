package com.atacanyavuz.kafka_event_streaming_platform.messaging.event;

public record MessageEvent(
        String header,
        String body
) {
}
