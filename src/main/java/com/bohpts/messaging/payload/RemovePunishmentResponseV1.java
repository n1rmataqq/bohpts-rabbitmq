package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record RemovePunishmentResponseV1(
        Long requestId,
        Boolean success,
        String message
) {
}