package com.devsuperior.tddentregar.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.tddentregar.dto.EventDTO;
import com.devsuperior.tddentregar.entities.City;
import com.devsuperior.tddentregar.entities.Event;
import com.devsuperior.tddentregar.repositories.EventRepository;
import com.devsuperior.tddentregar.services.exceptions.ServicesNotFoundException;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	@Transactional
	public EventDTO update(Long id, EventDTO eventDto) {
		try {
			Event newEvent = eventRepository.getById(id); //cria apenas uma referencia da Entidade
			newEvent.setName(eventDto.getName());
			newEvent.setDate(eventDto.getDate());
			newEvent.setUrl(eventDto.getUrl());
			newEvent.setCity(new City(eventDto.getCityId(), null));
			newEvent = eventRepository.save(newEvent);	
			return new EventDTO(newEvent);
		} catch (EntityNotFoundException e) {
			throw new ServicesNotFoundException("ID ["+ id +"] Not Found!");
		}
	}

}
