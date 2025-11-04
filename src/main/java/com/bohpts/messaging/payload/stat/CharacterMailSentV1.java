package com.bohpts.messaging.payload.stat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterMailSentV1(
        Long mailId,
        Long fromCharId,
        Long toCharId,
        String subject,
        String content,
        Long expiration,
        Long reqAdena,
        List<Item> attachments
) {
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Item(
            Long itemId,
            Long itemObjectId,
            Integer enchantLevel,
            Long count
    ) {
    }
}