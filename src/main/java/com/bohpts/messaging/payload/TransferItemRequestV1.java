package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransferItemRequestV1(
        Long requestId,
        Long charIdFrom,
        Long charIdTo,
        Long itemId,
        Long itemObjectId,
        Integer count
) {
}