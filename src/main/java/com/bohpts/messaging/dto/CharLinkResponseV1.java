package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("CharLinkResponseV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharLinkResponseV1(
        Long requestId,
        Boolean success,
        String message,
        Long tgUserId,
        Long charId,
        String charName,
        String confirmationCode
) {
}