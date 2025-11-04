package com.bohpts.messaging.payload.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterLoggedIn(
        String account,
        Long charId,
        String charName,
        String ip,
        String hwid
) {
}