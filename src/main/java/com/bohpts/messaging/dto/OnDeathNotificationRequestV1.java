package com.bohpts.messaging.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record OnDeathNotificationRequestV1(
        Long charId,
        Long killerObjectId,
        String killerName,
        String killerClanName
) {
}