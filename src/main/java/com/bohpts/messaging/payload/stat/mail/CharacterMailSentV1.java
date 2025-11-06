package com.bohpts.messaging.payload.stat.mail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailSentV1(
        Long mailId,
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