package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record PunishmentRequestV1(
        String sort,
        String name,
        String affect,
        String type,
        String expirationDate,
        String reason
) {
}