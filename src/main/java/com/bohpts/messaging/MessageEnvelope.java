package com.bohpts.messaging;

import java.util.Map;

public record MessageEnvelope(
        String type,
        Map<String, Object> payload
) {
}