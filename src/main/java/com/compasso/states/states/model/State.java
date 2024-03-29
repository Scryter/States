package com.compasso.states.states.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class State {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;							//"id": "1",
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
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	
	
	
}
