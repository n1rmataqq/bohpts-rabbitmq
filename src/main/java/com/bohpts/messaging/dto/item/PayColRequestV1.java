package com.bohpts.messaging.dto.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record PayColRequestV1(
        Long requestId,
        String handler,
        Long charId,
        Long count
) {
}