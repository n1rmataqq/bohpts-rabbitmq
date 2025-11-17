package com.bohpts.messaging.dto.telegram;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.UUID;

@Builder
@MessageAlias("CharInfoResponseV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharInfoResponseV1(
        UUID correlationId,
        Long timestampMs,
        Long charId,
        String charName,
        Integer level,
        Boolean isOnline,
        CharStatsDto charStats,
        ItemStatsDto itemStats,
        AutofarmStatsDto autofarmStats
) {
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record CharStatsDto(
            Integer currentCp,
            Integer maxCp,
            Integer currentHp,
            Integer maxHp,
            Integer currentMp,
            Integer maxMp
    ) {
    }

    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record ItemStatsDto(
            Long adenaCount
    ) {
    }

    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record AutofarmStatsDto(
            Boolean isAutofarmEnabled,
            Integer minutesRemaining
    ) {
    }
}