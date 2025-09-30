package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record ServerStatusV1(
        Boolean gmMod,
        Status status
) {
    private enum Status {
        UP,
        DOWN
    }
}