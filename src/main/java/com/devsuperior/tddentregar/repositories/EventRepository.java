package com.devsuperior.tddentregar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.tddentregar.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
