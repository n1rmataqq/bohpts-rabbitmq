package com.bohpts.messaging.dto.stat;

import com.bohpts.messaging.dto.common.Item;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharactersExchangeCompletedV1(
        Long initiatorCharId,
        Long partnerCharId,
        List<Item> initiatorItems,
        List<Item> partnerItems
) {
}