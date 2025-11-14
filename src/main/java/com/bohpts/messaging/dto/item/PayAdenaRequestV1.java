package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("PayAdenaRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record PayAdenaRequestV1(
        String handler,
        Long charId,
        Long count
) implements Repliable<PayAdenaResponseV2> {

    @Override
    public Class<PayAdenaResponseV2> replyType() {
        return null;
    }
}