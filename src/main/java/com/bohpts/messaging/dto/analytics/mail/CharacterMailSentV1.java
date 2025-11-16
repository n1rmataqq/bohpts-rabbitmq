package com.bohpts.messaging.dto.analytics.mail;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
@MessageAlias("CharacterMailSentV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailSentV1(
        Long timestampMs,
        UUID mailUUID,
        Long fromCharId,
        Long toCharId,
        String customAuthor,
        String subject,
        String content,
        Long expiration,
        Long reqAdena,
        List<MailItemAttachment> attachments
) {
}