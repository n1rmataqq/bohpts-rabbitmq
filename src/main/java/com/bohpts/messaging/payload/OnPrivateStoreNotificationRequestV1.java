package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record OnPrivateStoreNotificationRequestV1(
        Long traderCharId,
        Long clientCharId,
        String clientCharName,
        PrivateStoreType storeType,
        List<Item> items,
        Long tradeAmount,
        Long traderAdena
) {
    public enum PrivateStoreType {
        BUY,
        SELL,
        PACKAGE_SELL
    }

    public record Item(
            Long itemId,
            String itemNameRu,
            String itemNameEn,
            Long count
    ) {
    }
}