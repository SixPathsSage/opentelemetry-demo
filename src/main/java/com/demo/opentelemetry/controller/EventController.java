package com.demo.opentelemetry.controller;

import com.demo.opentelemetry.dto.EventDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
@Slf4j
public class EventController {
    @GetMapping("/{id}")
    public ResponseEntity<EventDTO> getEventById(@PathVariable("id") long id) {
        log.info("Getting event for id " + id);
        return new ResponseEntity<>(new EventDTO(id, "Opentelemetry Demo"), HttpStatus.OK);
    }
}
