package com.bohpts.messaging.dto;

import com.bohpts.messaging.MessageAlias;
import com.bohpts.messaging.Responsable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import java.util.List;

@Builder
@MessageAlias("SendMailRequestV1")
@JsonIgnoreProperties(ignoreUnknown = true)
public record SendMailRequestV1(
        Long charId,
        String author,
        String title,
        String body,
        List<Item> items
) implements Responsable<SendMailResponseV1> {

    public record Item(
            Long itemId,
            Long count
    ) {
    }

    @Override
    public Class<SendMailResponseV1> responseType() {
        return SendMailResponseV1.class;
    }
}