package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@MessageAlias("RemovePunishmentResponseV1")
@JsonIgnoreProperties(ignoreUnknown = true)
//todo use ResponseV2
public record RemovePunishmentResponseV1(
        UUID correlationId,
        Boolean success,
        String message
) {
}