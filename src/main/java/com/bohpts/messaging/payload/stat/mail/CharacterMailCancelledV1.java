package com.bohpts.messaging.payload.stat.mail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailCancelledV1(
        Long mailId,
        Long byCharId,
        List<MailItemAttachment> attachments
) {
}