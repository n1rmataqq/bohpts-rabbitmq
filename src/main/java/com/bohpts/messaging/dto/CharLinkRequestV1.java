package com.bohpts.messaging.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharLinkRequestV1(
        Long requestId,
        Long tgUserId,
        String tgUserFirstName,
        String account,
        String charName,
        String confirmationCode
) {
}