package com.bohpts.messaging;

/**
 * Marker for messages that expect a reply of type R.
 */
public interface Repliable<R> {
    Class<R> replyType();
}