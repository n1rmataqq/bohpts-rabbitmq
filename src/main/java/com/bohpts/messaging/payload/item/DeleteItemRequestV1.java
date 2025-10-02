package com.bohpts.messaging.payload.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record DeleteItemRequestV1(
        Long requestId,
        Long charIdFrom,
        Long itemObjectId
) {
}