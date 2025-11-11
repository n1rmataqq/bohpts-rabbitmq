package com.bohpts.messaging.dto.stat.mail;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
@MessageAlias("CharacterMailAcceptedV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailAcceptedV1(
        Long timestampMs,
        UUID mailUUID,
        Long byCharId,
        List<MailItemAttachment> attachments
) {
}