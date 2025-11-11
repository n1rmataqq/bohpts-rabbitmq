package com.bohpts.messaging.dto.stat;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("ServerStatusV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record ServerStatusV1(
        Long timestampMs,
        Boolean gmMode,
        Status status
) {
    public enum Status {
        UP,
        DOWN
    }
}