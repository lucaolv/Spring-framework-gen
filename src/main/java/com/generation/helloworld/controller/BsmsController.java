package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class BsmsController {

	@GetMapping
	public String bsms() {
		return "BSM's: [Mentalidade de crescimento, Orientação ao futuro, Persistência,"
					+ "Responsabilidade pessoal, Orientação ao detalhe,"
					+ "Trabalho em equipe, Proatividade Comunicação]";
	}
}