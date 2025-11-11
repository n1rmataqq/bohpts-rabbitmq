package com.bohpts.messaging.dto.stat.market;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.dto.common.PrivateStoreType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
@MessageAlias("TradeCompletedV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record TradeCompletedV1(
        Long timestampMs,
        PrivateStoreType tradeType,
        UUID transactionUUID,
        Long traderCharId,
        Long clientCharId,
        Long tradeAmount,
        List<TradeItemEvent> items
) {
}