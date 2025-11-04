package com.bohpts.messaging.payload.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record ClanOnlineV1(
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