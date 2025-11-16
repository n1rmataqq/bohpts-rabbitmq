package com.bohpts.messaging.dto.analytics.mail;

import com.bohpts.messaging.dto.common.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class MailItemAttachment extends Item {
    Long newItemObjectId;
}