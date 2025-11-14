package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("AddItemRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record AddItemRequestV1(
        Long charIdTo,
        Long itemId,
        Long count
) implements Repliable<AddItemResponseV2> {

    @Override
    public Class<AddItemResponseV2> replyType() {
        return AddItemResponseV2.class;
    }
}