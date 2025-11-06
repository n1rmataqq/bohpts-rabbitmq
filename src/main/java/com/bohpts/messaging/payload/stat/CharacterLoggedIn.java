package com.bohpts.messaging.payload.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterLoggedIn(
        UUID sessionId,
        String account,
        Long charId,
        String charName,
        String ip,
        String hwid
) {
}