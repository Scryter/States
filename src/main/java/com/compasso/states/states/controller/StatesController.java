package com.compasso.states.states.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.compasso.states.states.controller.dto.StateDto;
import com.compasso.states.states.controller.form.StateForm;
import com.compasso.states.states.model.State;
import com.compasso.states.states.repository.StatesRepository;


@RestController @RequestMapping("/api/states")
public class StatesController {
	
	@Autowired
	private StatesRepository stateRepository;
	
	
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
	
	
	@PostMapping
	public void cadastrar(StateForm form)
	{
		State state = form.converter();
		stateRepository.save(state);
	}

}