package com.hallworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hallo")
public class HalloController {
	
	@GetMapping
	public String hello() {
		return "Hallo Generation!!"+"\nMentalidades:"+ "\nOrientação ao Futuro"
				+ "\nResponsabilidade Pessoal"
				+ "\nMentalidade de Crescimento"
				+ "\nPersistência" +
				"\nHabilidades:"
				+ "\nTrabalho em Equipe"
				+ "\nAtenção aos Detalhes"
				+ "\nProatividade"
				+ "\nComunicação"+"\n  Essa semana espero compreender melhor os conteudos,manter mais o foco e persistir";
	}

}
