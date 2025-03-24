package com.atacanyavuz.databasesystems.messaging.event;

import com.atacanyavuz.databasesystems.messaging.enums.OperationType;

public record MessageEvent(
        OperationType op,
        Long id,
        String val1,
        String val2
) {
}
