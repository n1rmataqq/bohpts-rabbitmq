package com.bohpts.messaging;

public final class TypeHeaders {
    private TypeHeaders() {
    }

    public static final String TYPE_ID = "__TypeId__";
    public static final String KEY_TYPE_ID = "__KeyTypeId__";         // для Map ключей
    public static final String CONTENT_TYPE_ID = "__ContentTypeId__"; // для List/Map элементов
}