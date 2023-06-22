package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivoController {

	@GetMapping
	public String objetivos() {
		return "MySQL, Spring, Trabalho em equipe";
	}
	
}
