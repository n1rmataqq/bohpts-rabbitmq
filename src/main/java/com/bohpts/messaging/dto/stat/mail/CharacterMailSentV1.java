package com.bohpts.messaging.dto.stat.mail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailSentV1(
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