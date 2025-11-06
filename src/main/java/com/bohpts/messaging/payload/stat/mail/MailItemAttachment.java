package com.bohpts.messaging.payload.stat.mail;

import com.bohpts.messaging.payload.common.Item;
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