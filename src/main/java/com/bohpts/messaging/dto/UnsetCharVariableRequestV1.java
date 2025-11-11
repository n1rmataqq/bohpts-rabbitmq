package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("UnsetCharVariableRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record UnsetCharVariableRequestV1(
        Long charId,
        String name
) {
}