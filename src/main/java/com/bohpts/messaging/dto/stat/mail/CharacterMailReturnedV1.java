package com.bohpts.messaging.dto.stat.mail;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@MessageAlias("CharacterMailReturnedV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailReturnedV1(
        Long timestampMs,
        UUID mailUUID,
        Long byCharId
) {
}