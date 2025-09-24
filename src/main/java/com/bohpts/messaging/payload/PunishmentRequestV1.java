package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
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