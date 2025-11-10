package com.bohpts.messaging.dto.clientpackets;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record RequestRestartPoint(Long charId) {
}
