package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@MessageAlias("SendMailRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record SendMailRequestV1(
        Long requestId,
        Long charId,
        String author,
        String title,
        String body,
        List<Item> items
) {
    public record Item(
            Long itemId,
            Long count
    ) {
    }
}