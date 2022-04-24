package com.devsuperior.tddentregar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.tddentregar.dto.EventDTO;
import com.devsuperior.tddentregar.services.EventService;

@RestController
@RequestMapping(value = "/events")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<EventDTO> update(@PathVariable Long id, @RequestBody EventDTO eventDTO) {
		EventDTO newEventDto = eventService.update(id, eventDTO);
		return ResponseEntity.ok().body(newEventDto);
	}

}
