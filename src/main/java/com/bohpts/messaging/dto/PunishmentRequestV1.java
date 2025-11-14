package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("PunishmentRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record PunishmentRequestV1(
        String sort,
        String name,
        String affect,
        String type,
        Long expirationTime,
        String reason,
        String punishedBy
) implements Repliable<PunishmentResponseV1> {

    @Override
    public Class<PunishmentResponseV1> replyType() {
        return PunishmentResponseV1.class;
    }
}