package com.bohpts.messaging.payload.action;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record KickPlayerRequestV1(Long charId) {
}