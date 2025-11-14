package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@MessageAlias("CharLinkRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
//todo use ResponseV2
public record CharLinkRequestV1(
        UUID correlationId,
        Long tgUserId,
        String account,
        String charName,
        String confirmationCode
) {
}