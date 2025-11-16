package com.bohpts.messaging.dto.analytics;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@MessageAlias("ClanOnlineV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record ClanOnlineV1(
        Long timestampMs,
        List<ClanStat> clanStats
) {

    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record ClanStat(
            Long clanId,
            Integer members,
            Integer onlineMembers
    ) {
    }
}