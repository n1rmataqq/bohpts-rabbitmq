package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record ServerStatusV1(
        Boolean gmMode,
        Status status
) {
    public enum Status {
        UP,
        DOWN
    }
}