package com.devsuperior.tddentregar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.tddentregar.dto.CityDTO;
import com.devsuperior.tddentregar.services.CityService;

@RestController
@RequestMapping(value = "/cities")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping
	public ResponseEntity<List<CityDTO>> findAll() {
		List<CityDTO> citiesDto = cityService.findAll();
		return ResponseEntity.ok().body(citiesDto);
	}

}
