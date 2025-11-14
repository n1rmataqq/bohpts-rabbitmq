package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.dto.ResponseV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@MessageAlias("PayAdenaResponseV2")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class PayAdenaResponseV2 extends ResponseV2<ItemRequestStatus> {

    private String handler;

    public PayAdenaResponseV2(UUID correlationId, ItemRequestStatus status) {
        this(correlationId, status, null);
    }

    public PayAdenaResponseV2(UUID correlationId, ItemRequestStatus status, String handler) {
        this(correlationId, status, null, handler);
    }

    public PayAdenaResponseV2(UUID correlationId, ItemRequestStatus status, String message, String handler) {
        super();
        this.correlationId = correlationId;
        this.success = status == ItemRequestStatus.SUCCESS;
        this.status = status;
        this.message = message;
        this.handler = handler;
    }
}