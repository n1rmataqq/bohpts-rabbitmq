package com.bohpts.messaging.dto.analytics.event;

import com.bohpts.messaging.MessageAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor
@MessageAlias("ServerStatusV1")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class ServerStatusV1 extends ServerEventV1 {

    private long pid;
    private Boolean gmMode;

    @JsonCreator
    public ServerStatusV1(
            @JsonProperty("timestampMs") Long timestampMs,
            @JsonProperty("eventUUID") UUID eventUUID,
            @JsonProperty("type") EventType type,
            @JsonProperty("phase") EventPhase phase,
            @JsonProperty("pid") long pid,
            @JsonProperty("gmMode") Boolean gmMode
    ) {
        super();
        this.timestampMs = timestampMs;
        this.eventUUID = eventUUID;
        this.type = type;
        this.phase = phase;
        this.gmMode = gmMode;
        this.pid = pid;
    }
}