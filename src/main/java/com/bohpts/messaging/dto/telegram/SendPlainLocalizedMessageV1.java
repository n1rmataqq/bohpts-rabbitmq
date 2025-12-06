package com.bohpts.messaging.dto.telegram;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("SendPlainMessageV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record SendPlainLocalizedMessageV1(
        Long tgUserId,
        String messageLocalizationKey
) {
}