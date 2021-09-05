package com.compasso.states.states.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compasso.states.states.model.State;

public interface StatesRepository extends JpaRepository<State, String>{
	List<State> findByNome(String nome);

}
