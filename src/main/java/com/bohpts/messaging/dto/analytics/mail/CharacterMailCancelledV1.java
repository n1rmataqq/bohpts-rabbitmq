package com.bohpts.messaging.dto.analytics.mail;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
@MessageAlias("CharacterMailCancelledV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailCancelledV1(
        Long timestampMs,
        UUID mailUUID,
        Long byCharId,
        List<MailItemAttachment> attachments
) {
}