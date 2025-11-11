package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("SetCharVariableRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record SetCharVariableRequestV1(
        Long charId,
        String name,
        String value
) {
}