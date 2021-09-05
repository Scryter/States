package com.compasso.states.states.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

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
	@Transactional
	public ResponseEntity<StateDto> cadastrar(StateForm form, UriComponentsBuilder uriBuilder)
	{
		State state = form.converter();
		stateRepository.save(state);
		
		URI uri = uriBuilder.path("/api/states/{id}").buildAndExpand(state.getId()).toUri();
		return ResponseEntity.created(uri).body(new StateDto(state));
	}

}