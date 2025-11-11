package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("TransferCharResponseV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransferCharResponseV1(
        Long requestId,
        Boolean success,
        String message
) {
}