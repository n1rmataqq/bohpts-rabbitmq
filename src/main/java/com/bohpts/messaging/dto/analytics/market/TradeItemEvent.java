package com.bohpts.messaging.dto.analytics.market;

import com.bohpts.messaging.dto.common.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class TradeItemEvent extends Item {
    Long price;
    Long newItemObjectId;
}