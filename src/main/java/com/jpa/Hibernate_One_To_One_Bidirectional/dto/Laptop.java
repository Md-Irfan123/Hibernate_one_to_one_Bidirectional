package com.jpa.Hibernate_One_To_One_Bidirectional.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor



public class Laptop {
	
	@Id
	private int id;
	private String name;
	private String color;
	private double price ;
	
	
	
	
	
	@OneToOne(mappedBy = "laptop",fetch = FetchType.LAZY)
	private Employee employee;





	public Laptop(int id, String name, String color, double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}





	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price;
	}


		


	}
	
	


