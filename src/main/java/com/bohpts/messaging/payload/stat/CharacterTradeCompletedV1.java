package com.bohpts.messaging.payload.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterTradeCompletedV1(
        Long fromCharId,
        Long toCharId,
        List<Item> items
) {
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Item(
            Long itemId,
            Long itemObjectId,
            Integer enchantLevel,
            Long count
    ) {
    }
}