package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("TransferItemRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransferItemRequestV1(
        Long charIdFrom,
        Long charIdTo,
        Long itemObjectId,
        Long count
) implements Repliable<TransferItemResponseV2> {

    @Override
    public Class<TransferItemResponseV2> replyType() {
        return TransferItemResponseV2.class;
    }
}