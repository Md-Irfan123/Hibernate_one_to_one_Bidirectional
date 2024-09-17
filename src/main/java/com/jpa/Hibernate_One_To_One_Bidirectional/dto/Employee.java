package com.jpa.Hibernate_One_To_One_Bidirectional.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	
	
	@JoinColumn(name="laptopId")
	@OneToOne(fetch = FetchType.LAZY)
	private Laptop laptop;


	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "id: " + id + "\nname: " + name + "\nemail=" + email + "\nphone=" + phone + "\nlaptop=" + laptop;
	}
	
	

}
