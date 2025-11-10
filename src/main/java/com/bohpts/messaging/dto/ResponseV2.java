package com.bohpts.messaging.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ResponseV2<T> {
    protected Long requestId;
    protected Boolean success;
    protected T status;
    protected String message;
}