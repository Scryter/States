package com.compasso.states.states.controller.form;

import java.math.BigDecimal;

import com.compasso.states.states.model.State;



public class StateForm 
{
	private String nome, regiao;			// "nome": "Rio Grande do Norte", "regiao": "Nordeste",
	private int populacao;					// "populacao": 3409000,
	private String capital;					// "capital": "Natal" ,
	private BigDecimal area;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	
	public State converter() {
		// TODO Auto-generated method stub
		//Car car = repository.findByNome(nome)
		return new State(nome, regiao, populacao, capital, area);
	}
}
