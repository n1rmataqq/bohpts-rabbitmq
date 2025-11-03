package com.bohpts.messaging;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class CommonResponseV1 extends ResponseV2<CommonStatus> {

    private final String requestType;

    public CommonResponseV1(String requestType, Long requestId, CommonStatus status) {
        this(requestType, requestId, status, null);
    }

    public CommonResponseV1(String requestType, Long requestId, CommonStatus status, String message) {
        super();
        this.requestType = requestType;
        this.requestId = requestId;
        this.success = status == CommonStatus.SUCCESS;
        this.status = status;
        this.message = message;
    }
}