package com.bohpts.messaging.payload.stat;

import com.bohpts.messaging.payload.common.Item;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
        List<ItemAttachment> attachments
) {

    @Data
    @SuperBuilder
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(callSuper = true)
    public final static class ItemAttachment extends Item {
        Long newItemObjectId;
    }
}