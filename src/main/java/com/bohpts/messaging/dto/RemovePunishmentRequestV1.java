package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("RemovePunishmentRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record RemovePunishmentRequestV1(
        Long requestId,
        Long punishmentId
) {
}