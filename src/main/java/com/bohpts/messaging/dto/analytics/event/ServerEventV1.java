package com.bohpts.messaging.dto.analytics.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class ServerEventV1 {
    protected Long timestampMs;
    protected UUID eventUUID;
    protected EventType type;
    protected EventPhase phase;
}