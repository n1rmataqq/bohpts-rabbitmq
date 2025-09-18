package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharAuthHistoryV1(
        String account,
        Long charId,
        String charName,
        String ip,
        String hwid,
        LocalDateTime authAt
) {
}