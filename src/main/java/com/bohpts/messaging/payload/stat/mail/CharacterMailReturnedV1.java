package com.bohpts.messaging.payload.stat.mail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailReturnedV1(
        Long mailId,
        Long byCharId
) {
}