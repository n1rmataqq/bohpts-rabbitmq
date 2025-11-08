package com.bohpts.messaging.payload.stat.market;

import com.bohpts.messaging.payload.common.PrivateStoreType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record TradeCompletedV1(
        PrivateStoreType tradeType,
        UUID transactionUUID,
        Long traderCharId,
        Long clientCharId,
        Long tradeAmount,
        List<TradeItemEvent> items
) {
}