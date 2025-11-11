package com.bohpts.messaging;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.ScanResult;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public final class TypeAliasRegistry {
    private static final Map<Class<?>, String> CLASS_TO_ALIAS = new ConcurrentHashMap<>();
    private static final Map<String, Class<?>> ALIAS_TO_CLASS = new ConcurrentHashMap<>();

    static {
        String pkg = "com.bohpts.messaging.dto";
        try (ScanResult scanResult = new ClassGraph()
                .enableAnnotationInfo()
                .acceptPackages(pkg)
                .scan()) {
            ClassInfoList classInfoList = scanResult.getClassesWithAnnotation(MessageAlias.class.getName());
            for (Class<?> clazz : classInfoList.loadClasses()) {
                MessageAlias aliasAnnotation = clazz.getAnnotation(MessageAlias.class);
                String alias = aliasAnnotation.value();
                if (alias.isBlank()) {
                    alias = clazz.getSimpleName();
                }
                register(clazz, alias);
            }
        }
    }

    private TypeAliasRegistry() {
    }

    public static Optional<String> getAliasFor(Class<?> clazz) {
        return Optional.ofNullable(CLASS_TO_ALIAS.get(clazz));
    }

    public static Optional<Class<?>> getClassFor(String alias) {
        return Optional.ofNullable(ALIAS_TO_CLASS.get(alias));
    }

    private static void register(Class<?> clazz, String alias) {
        if (ALIAS_TO_CLASS.containsKey(alias) && !ALIAS_TO_CLASS.get(alias).equals(clazz)) {
            throw new IllegalStateException("Alias '" + alias + "' is already registered for a different class: " + ALIAS_TO_CLASS.get(alias).getName());
        }
        CLASS_TO_ALIAS.put(clazz, alias);
        ALIAS_TO_CLASS.put(alias, clazz);
    }
}