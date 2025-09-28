package com.bohpts.messaging.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record MailHistoryV1(
        Long messageId,
        Long senderCharId,
        Long receiverCharId,
        String subject,
        String content,
        Long expiration,
        Long reqAdena,
        List<Item> attachments
) {
    public record Item(
            Long itemId,
            Long itemObjectId,
            Integer enchantLevel,
            Long count
    ) {
    }
}