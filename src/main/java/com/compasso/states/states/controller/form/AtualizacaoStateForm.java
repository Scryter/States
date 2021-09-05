package com.compasso.states.states.controller.form;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.compasso.states.states.model.State;
import com.compasso.states.states.repository.StatesRepository;

public class AtualizacaoStateForm {
	@NotNull @NotEmpty @Length(min = 3)
	private String nome, regiao;			// "nome": "Rio Grande do Norte", "regiao": "Nordeste",
	@NotNull
	private int populacao;					// "populacao": 3409000,
	@NotNull @NotEmpty @Length(min = 3)
	private String capital;					// "capital": "Natal" ,
	@NotNull
	private BigDecimal area;				// "area": 52.797*/
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
	public State atualizar(Long id, StatesRepository stateRepository) {
		// TODO Auto-generated method stub
		State state = stateRepository.getOne(id);
		state.setNome(this.nome);
		state.setCapital(this.capital);
		state.setArea(this.area);
		state.setPopulacao(this.populacao);
		state.setRegiao(this.regiao);
		return state;
	}
	
	
	
}
