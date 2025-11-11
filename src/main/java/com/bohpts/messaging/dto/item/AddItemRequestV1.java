package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("AddItemRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record AddItemRequestV1(
        Long requestId,
        Long charIdTo,
        Long itemId,
        Long count
) {
}