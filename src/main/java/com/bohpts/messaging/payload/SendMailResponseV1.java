package com.bohpts.messaging.payload;

import com.bohpts.messaging.CommonStatus;
import com.bohpts.messaging.ResponseV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class SendMailResponseV1 extends ResponseV2<CommonStatus> {

    private final Set<Integer> createdMailIds;

    public SendMailResponseV1(Long requestId, CommonStatus status, Set<Integer> createdMailIds) {
        this(requestId, status, createdMailIds, null);
    }

    public SendMailResponseV1(Long requestId, CommonStatus status, Set<Integer> createdMailIds, String message) {
        super();
        this.requestId = requestId;
        this.success = status == CommonStatus.SUCCESS;
        this.createdMailIds = createdMailIds;
        this.status = status;
        this.message = message;
    }
}