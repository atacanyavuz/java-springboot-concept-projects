package com.atacanyavuz.databasesystems.messaging.event;

import com.atacanyavuz.databasesystems.enums.OperationType;

public record BroadcastEvent(
        OperationType op,
        Long id,
        String val1,
        String val2
) {
}
