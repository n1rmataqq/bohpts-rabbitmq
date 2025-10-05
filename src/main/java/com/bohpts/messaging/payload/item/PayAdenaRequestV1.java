package com.bohpts.messaging.payload.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record PayAdenaRequestV1(
        Long requestId,
        Long charId,
        Long count
) {
}