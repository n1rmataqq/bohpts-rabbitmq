package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.dto.ResponseV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MessageAlias("PayColResponseV2")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class PayColResponseV2 extends ResponseV2<ItemRequestStatus> {

    private String handler;

    public PayColResponseV2(Long requestId, ItemRequestStatus status) {
        this(requestId, status, null);
    }

    public PayColResponseV2(Long requestId, ItemRequestStatus status, String handler) {
        this(requestId, status, null, handler);
    }

    public PayColResponseV2(Long requestId, ItemRequestStatus status, String message, String handler) {
        super();
        this.requestId = requestId;
        this.success = status == ItemRequestStatus.SUCCESS;
        this.status = status;
        this.message = message;
        this.handler = handler;
    }
}