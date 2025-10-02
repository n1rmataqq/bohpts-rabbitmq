package com.bohpts.messaging.payload.item;

import com.bohpts.messaging.ResponseV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class TransferItemResponseV2 extends ResponseV2<ItemRequestStatus> {

    public TransferItemResponseV2(Long requestId, ItemRequestStatus status) {
        new TransferItemResponseV2(requestId, status, null);
    }

    public TransferItemResponseV2(Long requestId, ItemRequestStatus status, String message) {
        super();
        this.requestId = requestId;
        this.success = status == ItemRequestStatus.SUCCESS;
        this.status = status;
        this.message = message;
    }
}