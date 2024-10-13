package com.demo.opentelemetry.dto;

import com.demo.opentelemetry.entity.Event;

public record EventDTO(long id, String name) {
    public EventDTO(Event event) {
        this(event.getId(), event.getEventName());
    }
}
