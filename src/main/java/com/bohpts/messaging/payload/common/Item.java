package com.bohpts.messaging.payload.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    protected Long itemId;
    protected Long itemObjectId;
    protected Integer enchantLevel;
    protected Long count;
    protected List<Attribute> attributes;
}