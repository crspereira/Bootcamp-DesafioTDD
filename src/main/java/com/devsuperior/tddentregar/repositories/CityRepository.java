package com.devsuperior.tddentregar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.tddentregar.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
