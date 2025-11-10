package com.bohpts.messaging.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    protected Long itemId;
    protected Long itemObjectId;
    protected Integer enchantLevel;
    protected Long count;
    protected List<Attribute> attributes;
}