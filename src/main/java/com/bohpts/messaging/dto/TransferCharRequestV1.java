package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("TransferCharRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransferCharRequestV1(
        Long requestId,
        Long charId,
        String accountFrom,
        String accountTo
) {
}