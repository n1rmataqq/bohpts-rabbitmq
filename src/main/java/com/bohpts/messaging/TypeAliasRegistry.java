package com.bohpts.messaging;

import com.bohpts.messaging.dto.*;
import com.bohpts.messaging.dto.action.DeadPlayerTeleToTownRequestV1;
import com.bohpts.messaging.dto.action.KickPlayerRequestV1;
import com.bohpts.messaging.dto.action.ReloadInMemoryMail;
import com.bohpts.messaging.dto.clientpackets.RequestRestartPoint;
import com.bohpts.messaging.dto.item.*;
import com.bohpts.messaging.dto.stat.CharacterLoggedIn;
import com.bohpts.messaging.dto.stat.CharacterLoggedOut;
import com.bohpts.messaging.dto.stat.CharactersExchangeCompletedV1;
import com.bohpts.messaging.dto.stat.ClanOnlineV1;
import com.bohpts.messaging.dto.stat.mail.CharacterMailAcceptedV1;
import com.bohpts.messaging.dto.stat.mail.CharacterMailCancelledV1;
import com.bohpts.messaging.dto.stat.mail.CharacterMailReturnedV1;
import com.bohpts.messaging.dto.stat.mail.CharacterMailSentV1;
import com.bohpts.messaging.dto.stat.market.TradeCompletedV1;

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
        TypeAliasRegistry.register(DeadPlayerTeleToTownRequestV1.class, DeadPlayerTeleToTownRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(KickPlayerRequestV1.class, KickPlayerRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(ReloadInMemoryMail.class, ReloadInMemoryMail.class.getSimpleName());
        TypeAliasRegistry.register(RequestRestartPoint.class, RequestRestartPoint.class.getSimpleName());
        TypeAliasRegistry.register(AddItemRequestV1.class, AddItemRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(AddItemResponseV2.class, AddItemResponseV2.class.getSimpleName());
        TypeAliasRegistry.register(DeleteItemRequestV1.class, DeleteItemRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(DeleteItemResponseV2.class, DeleteItemResponseV2.class.getSimpleName());
        TypeAliasRegistry.register(PayAdenaRequestV1.class, PayAdenaRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(PayAdenaResponseV2.class, PayAdenaResponseV2.class.getSimpleName());
        TypeAliasRegistry.register(PayColRequestV1.class, PayColRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(PayColResponseV2.class, PayColResponseV2.class.getSimpleName());
        TypeAliasRegistry.register(TransferItemRequestV1.class, TransferItemRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(TransferItemResponseV2.class, TransferItemResponseV2.class.getSimpleName());
        TypeAliasRegistry.register(CharacterMailAcceptedV1.class, CharacterMailAcceptedV1.class.getSimpleName());
        TypeAliasRegistry.register(CharacterMailCancelledV1.class, CharacterMailCancelledV1.class.getSimpleName());
        TypeAliasRegistry.register(CharacterMailReturnedV1.class, CharacterMailReturnedV1.class.getSimpleName());
        TypeAliasRegistry.register(CharacterMailSentV1.class, CharacterMailSentV1.class.getSimpleName());
        TypeAliasRegistry.register(TradeCompletedV1.class, TradeCompletedV1.class.getSimpleName());
        TypeAliasRegistry.register(CharacterLoggedIn.class, CharacterLoggedIn.class.getSimpleName());
        TypeAliasRegistry.register(CharacterLoggedOut.class, CharacterLoggedOut.class.getSimpleName());
        TypeAliasRegistry.register(CharactersExchangeCompletedV1.class, CharactersExchangeCompletedV1.class.getSimpleName());
        TypeAliasRegistry.register(ClanOnlineV1.class, ClanOnlineV1.class.getSimpleName());
        TypeAliasRegistry.register(CharLinkRequestV1.class, CharLinkRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(CharLinkResponseV1.class, CharLinkResponseV1.class.getSimpleName());
        TypeAliasRegistry.register(OnDeathNotificationRequestV1.class, OnDeathNotificationRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(OnPrivateStoreNotificationRequestV1.class, OnPrivateStoreNotificationRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(PunishmentRequestV1.class, PunishmentRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(PunishmentResponseV1.class, PunishmentResponseV1.class.getSimpleName());
        TypeAliasRegistry.register(RemovePunishmentRequestV1.class, RemovePunishmentRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(RemovePunishmentResponseV1.class, RemovePunishmentResponseV1.class.getSimpleName());
        TypeAliasRegistry.register(SendMailRequestV1.class, SendMailRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(SendMailResponseV1.class, SendMailResponseV1.class.getSimpleName());
        TypeAliasRegistry.register(ServerStatusV1.class, ServerStatusV1.class.getSimpleName());
        TypeAliasRegistry.register(SetCharVariableRequestV1.class, SetCharVariableRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(TransferCharRequestV1.class, TransferCharRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(TransferCharResponseV1.class, TransferCharResponseV1.class.getSimpleName());
        TypeAliasRegistry.register(UnsetCharVariableRequestV1.class, UnsetCharVariableRequestV1.class.getSimpleName());
        TypeAliasRegistry.register(VoteAttemptV1.class, VoteAttemptV1.class.getSimpleName());
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