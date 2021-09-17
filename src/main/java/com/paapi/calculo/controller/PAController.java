package com.paapi.calculo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paapi.calculo.model.PAModel;
import com.paapi.calculo.service.PAService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/conta")
public class PAController {

	private PAService paService;
	
	@GetMapping(value = "/PA")
	public List<String> calcularPA(@RequestParam int PrimeiroTermo, @RequestParam int NumeroTermos, @RequestParam int Razao ) {
		return paService.conta(PrimeiroTermo, NumeroTermos, Razao);
	}
	
}
