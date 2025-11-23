package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Repliable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@MessageAlias("SendMailRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record SendMailRequestV1(
        Long charId,
        String authorEn,
        String authorRu,
        String titleEn,
        String titleRu,
        String bodyEn,
        String bodyRu,
        List<Item> items
) implements Repliable<SendMailResponseV1> {

    public record Item(
            Long itemId,
            Long count
    ) {
    }

    @Override
    public Class<SendMailResponseV1> replyType() {
        return SendMailResponseV1.class;
    }
}