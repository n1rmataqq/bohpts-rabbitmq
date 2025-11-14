package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("RemovePunishmentRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record RemovePunishmentRequestV1(
        Long punishmentId
) implements Repliable<RemovePunishmentResponseV1> {

    @Override
    public Class<RemovePunishmentResponseV1> replyType() {
        return RemovePunishmentResponseV1.class;
    }
}