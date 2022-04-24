package com.devsuperior.tddentregar.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.tddentregar.dto.CityDTO;
import com.devsuperior.tddentregar.entities.City;
import com.devsuperior.tddentregar.repositories.CityRepository;

@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;
	
	@Transactional(readOnly = true)
	public List<CityDTO> findAll() {
		List<City> cities = cityRepository.findAll(Sort.by("name"));
		return cities.stream().map(x -> new CityDTO(x)).collect(Collectors.toList());
	}

}
