package com.bohpts.messaging.payload.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record ClanStatV1(
        Long clanId,
        Integer members,
        Integer onlineMembers
) {
}