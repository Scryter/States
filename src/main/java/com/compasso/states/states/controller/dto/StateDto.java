package com.compasso.states.states.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.compasso.states.states.model.State;



public class StateDto {
	
	private int id;							//"id": "1",
	private String nome, regiao;			// "nome": "Rio Grande do Norte", "regiao": "Nordeste",
	private int populacao;					// "populacao": 3409000,
	private String capital;					// "capital": "Natal" ,
	private BigDecimal area;
	
	public StateDto(State state) {
		this.id = state.getId();
		this.nome = state.getNome();
		this.regiao = state.getRegiao();
		this.populacao = state.getPopulacao();
		this.capital = state.getCapital();
		this.area = state.getArea();
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public int getPopulacao() {
		return populacao;
	}

	public String getCapital() {
		return capital;
	}

	public BigDecimal getArea() {
		return area;
	}
	
	
	public static List<StateDto> converter(List<State> states) {
		// TODO Auto-generated method stub
		return states.stream().map(StateDto::new).collect(Collectors.toList());
	}	

}
