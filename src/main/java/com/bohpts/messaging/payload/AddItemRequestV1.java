package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record AddItemRequestV1(
        Long requestId,
        Long charIdTo,
        Long itemId,
        Long count
) {
}