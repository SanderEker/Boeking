package com.dave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dave.domain.Boeking;
import com.dave.service.BoekingService;

@Controller
public class WebController {

	@Autowired
	BoekingService boekingservice;
	
	@RequestMapping("/")
	public String getIndex(Model model){
		
		Boeking boeking = new Boeking();
		model.addAttribute("boeking", boeking);
		return "index";
	}
	
	@RequestMapping("displaySporters")
	public String displaySporters(Model model){
	List<Boeking> sporters =(List<Boeking>)boekingservice.showAll();
	model.addAttribute("pietjes", sporters);
		return "output";
	}
	
	
	@RequestMapping("orderbijhoogscore")
	public String sortOpScore(Model model){
	List<Boeking> lijst =(List<Boeking>)boekingservice.showAllByOrderByHighscoreAsc();
	model.addAttribute("pietjes", lijst);
		return "sortscore";
	}
	
	@RequestMapping("saveBoeking")
	public String saveBoeking(@ModelAttribute("boeking") Boeking boeking){
		boekingservice.saveBoeking(boeking);
		return "index";
	}
}
