package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("TransferItemRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransferItemRequestV1(
        Long requestId,
        Long charIdFrom,
        Long charIdTo,
        Long itemObjectId,
        Long count
) {
}