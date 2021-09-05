package com.compasso.states.states.controller.dto;

import java.math.BigDecimal;

import com.compasso.states.states.model.State;

public class DetalhesDoStateDto {

	private Long id;							//"id": "1",
	private String nome, regiao;			// "nome": "Rio Grande do Norte", "regiao": "Nordeste",
	private int populacao;					// "populacao": 3409000,
	private String capital;					// "capital": "Natal" ,
	private BigDecimal area;
	
	public DetalhesDoStateDto(State state)
	{
		this.id = state.getId();
		this.nome = state.getNome();
		this.regiao = state.getRegiao();
		this.populacao = state.getPopulacao();
		this.capital = state.getCapital();
		this.area = state.getArea();
	}

	public Long getId() {
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
	
	
	
	
	
}
