package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("PunishmentRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record PunishmentRequestV1(
        Long requestId,
        String sort,
        String name,
        String affect,
        String type,
        Long expirationTime,
        String reason,
        String punishedBy
) {
}