package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;
import java.util.UUID;

@Data
@MessageAlias("SendMailResponseV1")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class SendMailResponseV1 extends ResponseV2<CommonStatus> {

    private final Set<Integer> createdMailIds;

    public SendMailResponseV1(UUID correlationId, CommonStatus status, Set<Integer> createdMailIds) {
        this(correlationId, status, createdMailIds, null);
    }

    @JsonCreator
    public SendMailResponseV1(
            @JsonProperty("correlationId") UUID correlationId,
            @JsonProperty("status") CommonStatus status,
            @JsonProperty("createdMailIds") Set<Integer> createdMailIds,
            @JsonProperty("message") String message
    ) {
        super();
        this.correlationId = correlationId;
        this.success = status == CommonStatus.SUCCESS;
        this.createdMailIds = createdMailIds;
        this.status = status;
        this.message = message;
    }
}