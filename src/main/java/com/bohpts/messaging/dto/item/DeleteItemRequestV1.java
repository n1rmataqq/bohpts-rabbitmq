package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("DeleteItemRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record DeleteItemRequestV1(
        Long charIdFrom,
        Long itemObjectId
) implements Repliable<DeleteItemResponseV2> {

    @Override
    public Class<DeleteItemResponseV2> replyType() {
        return DeleteItemResponseV2.class;
    }
}