package com.bohpts.messaging.dto.item;

import com.bohpts.messaging.dto.ResponseV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class DeleteItemResponseV2 extends ResponseV2<ItemRequestStatus> {

    public DeleteItemResponseV2(Long requestId, ItemRequestStatus status) {
        this(requestId, status, null);
    }

    public DeleteItemResponseV2(Long requestId, ItemRequestStatus status, String message) {
        super();
        this.requestId = requestId;
        this.success = status == ItemRequestStatus.SUCCESS;
        this.status = status;
        this.message = message;
    }
}