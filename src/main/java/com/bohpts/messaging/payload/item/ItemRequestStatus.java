package com.bohpts.messaging.payload.item;

public enum ItemRequestStatus {
    SUCCESS,
    BAD_REQUEST,
    CHAR_NOT_FOUND,
    ITEM_NOT_FOUND,
    CAPACITY_EXCEEDED,
    WEIGHT_EXCEEDED,
    INVENTORY_FULL,
    UNSUPPORTED_LOCATION,
    UNEXPECTED_ERROR
}