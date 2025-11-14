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
@MessageAlias("TransferItemResponseV2")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class TransferItemResponseV2 extends ResponseV2<ItemRequestStatus> {

    public TransferItemResponseV2(UUID correlationId, ItemRequestStatus status) {
        this(correlationId, status, null);
    }

    public TransferItemResponseV2(UUID correlationId, ItemRequestStatus status, String message) {
        super();
        this.correlationId = correlationId;
        this.success = status == ItemRequestStatus.SUCCESS;
        this.status = status;
        this.message = message;
    }
}