package com.bohpts.messaging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a stable alias for a message class to be used in serialization.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MessageAlias {
    /**
     * The alias for the message type.
     *
     * @return the alias string.
     */
    String value();
}
