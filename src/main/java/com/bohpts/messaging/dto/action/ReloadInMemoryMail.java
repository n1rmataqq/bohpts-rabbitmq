package com.bohpts.messaging.dto.action;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@MessageAlias("ReloadInMemoryMail")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReloadInMemoryMail {
}
