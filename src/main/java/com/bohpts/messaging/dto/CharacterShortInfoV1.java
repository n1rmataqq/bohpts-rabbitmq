package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("CharacterShortInfoV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterShortInfoV1(
        String account,
        Long charId,
        String charName
) {
}