package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("VoteAttemptRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record VoteAttemptRequestV1(
        String account,
        Long charId,
        String charName,
        String ip,
        VoteProvider provider
) {
    public enum VoteProvider {
        HOPZONE,
        TOPZONE,
        L2JBRASIL,
        MMOTOP
    }
}