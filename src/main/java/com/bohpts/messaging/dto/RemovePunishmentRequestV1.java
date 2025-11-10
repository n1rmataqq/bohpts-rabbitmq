package com.bohpts.messaging.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record RemovePunishmentRequestV1(
        Long requestId,
        Long punishmentId
) {
}