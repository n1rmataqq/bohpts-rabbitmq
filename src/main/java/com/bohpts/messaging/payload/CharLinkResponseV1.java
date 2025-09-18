package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharLinkResponseV1(
        Boolean success,
        Long linkRequestId,
        Long tgUserId,
        Long charId,
        String charName,
        String confirmationCode,
        String message
) {
}