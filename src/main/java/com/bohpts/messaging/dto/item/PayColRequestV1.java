package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("PayColRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record PayColRequestV1(
        Long requestId,
        String handler,
        Long charId,
        Long count
) {
}