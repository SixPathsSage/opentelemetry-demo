package com.demo.opentelemetry.controller;

import com.demo.opentelemetry.dto.EventDTO;
import com.demo.opentelemetry.repository.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/event")
@Slf4j
public class EventController {

    @Autowired
    private EventRepository repository;
    @GetMapping("/{id}")
    public ResponseEntity<EventDTO> getEventById(@PathVariable("id") long id) {
        log.info("Getting event for id {}", id);
        return repository.findById(id)
                .map(EventDTO::new)
                .map(eventDTO -> new ResponseEntity<>(eventDTO, HttpStatus.OK))
                .orElseThrow(() -> new NoSuchElementException("Unable to find event with Id " + id));
    }
}
