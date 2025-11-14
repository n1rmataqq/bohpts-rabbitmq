package com.bohpts.messaging.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ResponseV2<T> {
    protected UUID correlationId;
    protected Boolean success;
    protected T status;
    protected String message;
}