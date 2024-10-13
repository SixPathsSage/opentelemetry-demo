package com.demo.opentelemetry.repository;

import com.demo.opentelemetry.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
