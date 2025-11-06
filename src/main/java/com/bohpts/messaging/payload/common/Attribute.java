package com.bohpts.messaging.payload.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record Attribute(
        AttributeType type,
        Long value
) {
}