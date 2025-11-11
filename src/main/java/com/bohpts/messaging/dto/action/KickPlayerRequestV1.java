package com.bohpts.messaging.dto.action;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("KickPlayerRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record KickPlayerRequestV1(
        Long charId
) {
}