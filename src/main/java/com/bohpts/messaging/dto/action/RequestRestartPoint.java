package com.bohpts.messaging.dto.action;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("RequestRestartPoint")
@JsonIgnoreProperties(ignoreUnknown = true)
public record RequestRestartPoint(Long charId) {
}
