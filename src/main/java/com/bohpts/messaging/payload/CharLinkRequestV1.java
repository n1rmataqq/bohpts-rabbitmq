package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharLinkRequestV1(
        Long linkRequestId,
        Long tgUserId,
        String tgUserFirstName,
        String account,
        String charName,
        String confirmationCode
) {
}