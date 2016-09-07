package com.dave.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dave.domain.Boeking;
import com.dave.repository.BoekingRepository;

@Service
public class BoekingService {

	@Autowired
	BoekingRepository boekingRepository;
	
	public Iterable<Boeking> showAll(){
		return boekingRepository.findAll();
	}
	
	public Iterable<Boeking> showAllByOrderByHighscoreAsc(){
		return boekingRepository.findAllByOrderByHighscoreAsc();
	}
	
	public Boeking findSporter(int id){
		return boekingRepository.findOne(id);
		
	}

	public Boeking findByName(String name){
		return boekingRepository.findByArrival(name);
		
	}

	public Boeking saveBoeking(Boeking boeking){
		return boekingRepository.save(boeking);
		
	}

	
}
