package com.bohpts.messaging.payload.stat.mail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailReturnedV1(
        UUID mailUUID,
        Long byCharId
) {
}