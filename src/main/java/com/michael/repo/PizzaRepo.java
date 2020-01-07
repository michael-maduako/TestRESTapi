package com.michael.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.model.Pizza;

@Repository
public interface PizzaRepo extends CrudRepository<Pizza,Long> {
	
}
