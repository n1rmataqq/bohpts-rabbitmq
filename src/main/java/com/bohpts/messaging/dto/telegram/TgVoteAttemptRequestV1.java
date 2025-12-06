package com.bohpts.messaging.dto.telegram;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("TgVoteAttemptRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record TgVoteAttemptRequestV1(
        Long tgUserId,
        Long charId,
        String provider
) {
}