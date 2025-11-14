package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@MessageAlias("TransferCharResponseV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransferCharResponseV1(
        UUID correlationId,
        Boolean success,
        String message
) {
}