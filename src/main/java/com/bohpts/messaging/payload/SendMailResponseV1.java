package com.bohpts.messaging.payload;

import com.bohpts.messaging.CommonStatus;
import com.bohpts.messaging.ResponseV2;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonCreator
    public SendMailResponseV1(
            @JsonProperty("requestId") Long requestId,
            @JsonProperty("status") CommonStatus status,
            @JsonProperty("createdMailIds") Set<Integer> createdMailIds,
            @JsonProperty("message") String message
    ) {
        super();
        this.requestId = requestId;
        this.success = status == CommonStatus.SUCCESS;
        this.createdMailIds = createdMailIds;
        this.status = status;
        this.message = message;
    }
}