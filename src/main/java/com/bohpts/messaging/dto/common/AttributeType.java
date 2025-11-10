package com.bohpts.messaging.dto.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AttributeType {
    NONE(-1),
    FIRE(0),
    WATER(1),
    WIND(2),
    EARTH(3),
    HOLY(4),
    DARK(5);

    @Getter
    private final int id;

    public static AttributeType fromId(int id) {
        for (AttributeType type : values()) {
            if (type.id == id) {
                return type;
            }
        }

        return NONE;
    }
}