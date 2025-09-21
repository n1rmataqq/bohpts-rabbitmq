package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record VoteAttemptV1(
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