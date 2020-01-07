package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.model.Pizza;
import com.michael.repo.PizzaRepo;

@Service
public class PizzaService {
	@Autowired
	PizzaRepo pRepo;
	
	public void addPizza(Pizza pizza) {
		pRepo.save(pizza);
	}
	
	public List<Pizza> getPizzas(){
		pRepo.findAll().forEach(System.out::println);
		return (List<Pizza>)pRepo.findAll();
	}
	
	public Optional<Pizza> getPizzaById(long id) {
		return pRepo.findById(id);
	}
	
	
	
}
