package com.bohpts.messaging;

import com.bohpts.messaging.dto.*;
import com.bohpts.messaging.dto.action.KickPlayerRequestV1;
import com.bohpts.messaging.dto.action.ReloadInMemoryMail;
import com.bohpts.messaging.dto.clientpackets.RequestRestartPoint;
import com.bohpts.messaging.dto.item.DeleteItemRequestV1;
import com.bohpts.messaging.dto.item.PayAdenaRequestV1;
import com.bohpts.messaging.dto.item.PayColRequestV1;
import com.bohpts.messaging.dto.item.TransferItemRequestV1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Cтабильные алиасы вместо FQCN (полезно для кросс-языков)
 */
public final class TypeAliasRegistry {
    private static final Map<Class<?>, String> CLASS_TO_ALIAS = new ConcurrentHashMap<>();
    private static final Map<String, Class<?>> ALIAS_TO_CLASS = new ConcurrentHashMap<>();

    //todo refactor @MessageAlias("PayAdenaRequestV1") aннотация + сканирование на старте
    static {
        TypeAliasRegistry.register(CharLinkRequestV1.class, CharLinkRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(PayAdenaRequestV1.class, PayAdenaRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(PayColRequestV1.class, PayColRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(RequestRestartPoint.class, RequestRestartPoint.class.getSimpleName());
        TypeAliasRegistry.register(SendMailRequestV1.class, SendMailRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(KickPlayerRequestV1.class, KickPlayerRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(TransferItemRequestV1.class, TransferItemRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(DeleteItemRequestV1.class, DeleteItemRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(TransferCharRequestV1.class, TransferCharRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(ReloadInMemoryMail.class, ReloadInMemoryMail.class.getSimpleName());
        TypeAliasRegistry.register(SetCharVariableRequestV1.class, SetCharVariableRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(UnsetCharVariableRequestV1.class, UnsetCharVariableRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(PunishmentRequestV1.class, PunishmentRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(RemovePunishmentRequestV1.class, RemovePunishmentRequestV1.class.getSimpleName());
    }

    private TypeAliasRegistry() {
    }

    public static void register(Class<?> clazz, String alias) {
        CLASS_TO_ALIAS.put(clazz, alias);
        ALIAS_TO_CLASS.put(alias, clazz);
    }

    public static String aliasOrNull(Class<?> clazz) {
        return CLASS_TO_ALIAS.get(clazz);
    }

    public static Class<?> resolveClass(String id) throws ClassNotFoundException {
        if (id == null || id.isBlank()) return Map.class;
        Class<?> byAlias = resolveOrNull(id);
        if (byAlias != null) return byAlias;
        // иначе считаем, что это FQCN
        return Class.forName(id);
    }

    public static Class<?> resolveOrNull(String alias) {
        return ALIAS_TO_CLASS.get(alias);
    }

    public static String simpleName(String typeId) {
        if (typeId == null) return "";
        int idx = typeId.lastIndexOf('.');
        return idx >= 0 ? typeId.substring(idx + 1) : typeId;
    }
}