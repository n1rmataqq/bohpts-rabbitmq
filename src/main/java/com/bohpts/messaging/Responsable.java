package com.bohpts.messaging;

public interface Responsable<R> {
    Class<R> responseType();
}