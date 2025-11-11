package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("DeleteItemRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record DeleteItemRequestV1(
        Long requestId,
        Long charIdFrom,
        Long itemObjectId
) {
}