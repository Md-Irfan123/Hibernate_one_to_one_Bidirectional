package com.jpa.Hibernate_One_To_One_Bidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.Hibernate_One_To_One_Bidirectional.dto.Laptop;

public class LaptopDao {
	
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Laptop getEmployeeLaptopByLaptopIdByDao(int id) {
		return em.find(Laptop.class, id);
	}

}
