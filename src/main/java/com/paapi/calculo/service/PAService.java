package com.paapi.calculo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.paapi.calculo.model.PAModel;

@Service
public class PAService {
	
	public PAService() {}
	
	public List<String> conta(int primeiroTermo, int numeroTermos, int razao) {
		
		
		int resultado = 0;
		
		List<Integer> passarResultado = new ArrayList();
		
		for (int i = 1; i <= numeroTermos; i++) {
			resultado = primeiroTermo + (i-1) * razao;
			passarResultado.add(resultado);
		}
		
		List<String> resultadoComIndice = new ArrayList();
		
		for(int numero : passarResultado){
		    String teste = String.valueOf(passarResultado.indexOf(numero)+1)+ " " + String.valueOf(numero);
		    resultadoComIndice.add(teste);
		}
		
		return resultadoComIndice;
	}

}
