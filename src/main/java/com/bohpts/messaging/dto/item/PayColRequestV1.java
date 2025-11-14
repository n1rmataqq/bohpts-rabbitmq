package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("PayColRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record PayColRequestV1(
        String handler,
        Long charId,
        Long count
) implements Repliable<PayColResponseV2> {

    @Override
    public Class<PayColResponseV2> replyType() {
        return PayColResponseV2.class;
    }
}