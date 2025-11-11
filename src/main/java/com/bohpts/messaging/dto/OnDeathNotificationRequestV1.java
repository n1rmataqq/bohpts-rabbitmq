package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("OnDeathNotificationRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record OnDeathNotificationRequestV1(
        Long charId,
        Long killerObjectId,
        String killerName,
        String killerClanName
) {
}