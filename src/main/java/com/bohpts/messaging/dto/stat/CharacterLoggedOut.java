package com.bohpts.messaging.dto.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterLoggedOut(
        UUID sessionId,
        String account,
        Long charId,
        String charName,
        String ip,
        String hwid
) {
}