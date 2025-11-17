package com.bohpts.messaging.dto.telegram;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("CharInfoRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharInfoRequestV1(
        Long charId
) implements Repliable<CharInfoResponseV1> {

    @Override
    public Class<CharInfoResponseV1> replyType() {
        return CharInfoResponseV1.class;
    }
}