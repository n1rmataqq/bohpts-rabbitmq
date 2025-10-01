package com.bohpts.messaging.payload.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record MailHistoryInternalV1(
        Long messageId,
        Long senderCharId,
        String senderName,
        Long receiverCharId,
        String receiverName,
        String subject,
        String content,
        LocalDateTime expiration,
        Long reqAdena,
        List<Item> attachments
) {
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Item(
            Long itemId,
            Long itemObjectId,
            String itemNameRu,
            String itemNameEn,
            Integer enchantLevel,
            Long count
    ) {
    }
}