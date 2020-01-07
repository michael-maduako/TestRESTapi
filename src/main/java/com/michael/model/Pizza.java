package com.michael.model;
import javax.persistence.*;

@Entity
@Table
public class Pizza {
	
	@Id @GeneratedValue
	private long id;
	private String name;
	
	public Pizza() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	
	
}
