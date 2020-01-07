package com.michael.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Pizza;
import com.michael.service.PizzaService;

@RestController
@RequestMapping("/pizza")

public class PizzaController {
	
	@Autowired
	PizzaService pService;

	@PostMapping("/add-pizza")
	public void addPizza(@RequestBody Pizza pizza) {
		pService.addPizza(pizza);
	}
	
	@GetMapping("/grab-all-pizzas")
	public List<Pizza> grabAllPizzas() {
		return pService.getPizzas();
	}
	
	@GetMapping("/grab-pizza/{id}")
	public Optional<Pizza> grabPizzaById(@RequestBody Pizza pizza, @PathVariable long id) {
		return pService.getPizzaById(id);
	}
	
	
	
	
	
	
	
	
}
