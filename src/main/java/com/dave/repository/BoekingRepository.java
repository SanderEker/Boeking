package com.dave.repository;

import org.springframework.data.repository.CrudRepository;

import com.dave.domain.Boeking;

public interface BoekingRepository extends CrudRepository<Boeking, Integer> {
	
	Boeking findByArrival(String string);
//	Boeking findByNameIgnoreCaseContaining(String string);
//Werkt niet zonder extra "By": 	Iterable<Boeking> findAllOrderByHighscoreAsc();
	Iterable<Boeking> findAllByOrderByHighscoreAsc();
}
