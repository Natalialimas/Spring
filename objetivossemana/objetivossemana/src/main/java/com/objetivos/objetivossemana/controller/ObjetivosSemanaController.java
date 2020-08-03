package com.objetivos.objetivossemana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("Objetivos da semana")

public class ObjetivosSemanaController {
	@GetMapping 
	
	public String Objetivosdasemana() {
		return "Aprender String";
	}

}
