package com.habilidadesmentalidades.hab.men.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Habilidades e mentalidades")
public class HabilidadesMentalidadesController {
 
	@GetMapping
	public String habilidadesmentalidades() {
		
		return "Persistencia e orientação aos detalhes";
	}
}
