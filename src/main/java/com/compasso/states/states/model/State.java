package com.compasso.states.states.model;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class State {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;							//"id": "1",
	private String nome, regiao;			// "nome": "Rio Grande do Norte", "regiao": "Nordeste",
	private int populacao;					// "populacao": 3409000,
	private String capital;					// "capital": "Natal" ,
	private BigDecimal area;				// "area": 52.797*/

	public State(String nome, String regiao, int populacao, String capital, BigDecimal area) {
		this.nome = nome;
		this.regiao = regiao;
		this.populacao = populacao;
		this.capital = capital;
		this.area = area;
	}
	public State() {
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
	
	
	
}
