package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("RemovePunishmentResponseV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record RemovePunishmentResponseV1(
        Long requestId,
        Boolean success,
        String message
) {
}