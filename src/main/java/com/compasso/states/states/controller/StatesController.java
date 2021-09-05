package com.compasso.states.states.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.compasso.states.states.controller.dto.StateDto;


@RestController @RequestMapping("/api/states")
public class StatesController {
	
	@GetMapping
	public List<StateDto> lista(String nomeState)
	{
		List<State> states;
		System.out.println("O cliente fez uma requisição como filtro: "+nomeState);
		if (nomeState == null)
			states = stateRepository.findAll();
		else	
			states = stateRepository.findByNome(nomeState);		
		return StateDto.converter(states);
	}

}