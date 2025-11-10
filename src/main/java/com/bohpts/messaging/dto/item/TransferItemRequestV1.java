package com.bohpts.messaging.dto.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransferItemRequestV1(
        Long requestId,
        Long charIdFrom,
        Long charIdTo,
        Long itemObjectId,
        Long count
) {
}