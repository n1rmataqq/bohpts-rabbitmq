package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record TransferCharRequestV1(
        Long requestId,
        Long charId,
        String accountFrom,
        String accountTo
) {
}