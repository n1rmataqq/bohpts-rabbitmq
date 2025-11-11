package com.bohpts.messaging.dto.stat;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@MessageAlias("CharacterLoggedOut")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterLoggedOutV1(
        Long timestampMs,
        UUID sessionId,
        String account,
        Long charId,
        String charName,
        String ip,
        String hwid
) {
}