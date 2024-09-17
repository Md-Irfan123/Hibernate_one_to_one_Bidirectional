package com.jpa.Hibernate_One_To_One_Bidirectional.controller;

import java.util.Scanner;

import com.jpa.Hibernate_One_To_One_Bidirectional.dao.EmployeeLaptopDao;
import com.jpa.Hibernate_One_To_One_Bidirectional.dao.LaptopDao;
import com.jpa.Hibernate_One_To_One_Bidirectional.dto.Employee;
import com.jpa.Hibernate_One_To_One_Bidirectional.dto.Laptop;

public class EmployeeLaptopController {

	public static void main(String[] args) {
		
		EmployeeLaptopDao dao=new EmployeeLaptopDao();
		Scanner sc=new Scanner(System.in);
		char p;
		
		do {
			System.out.println("Enter your option....");
			System.out.println("1.INSERT\n2.GetById\n3.DELETE\n4.UPDATE\n5.DISPLAY\n6.DeleteByJPQL\n7.UpdateByJPQL");
			int key=sc.nextInt();
			switch(key) {
		case 1:{
		
		Employee employee=new Employee(2321, "Ankur", "Ankur@ibm.com",45845904);
		
		Laptop laptop=new Laptop(3333, "Samsung", "White", 45000.9);
		
		
		dao.saveEmployeeLaptopDao( employee,laptop);
		}
		break;
		case 2:{
			
			Employee emp=dao.getLaptopByEmployeeIdDao(888);
			Laptop lap=emp.getLaptop();
			System.out.println(lap);
		}
		break;
			case 3:{
				Laptop laptop=new LaptopDao().getEmployeeLaptopByLaptopIdByDao(3333);
				System.out.println(laptop);
			
		
			
		}
		break;
		
			case 4: {
				for (Employee emp : dao.getAllEmployeeDetails()) {
					
					System.out.println(emp);
					
				}
			}
		
			}System.out.println("Press Y/y to continue");
			p=sc.next().charAt(0);
			
			}while(p=='Y'|| p== 'y');
		System.out.println("Program ends");

	}

}
