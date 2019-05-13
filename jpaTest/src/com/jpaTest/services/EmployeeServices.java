package com.jpaTest.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaTest.entities.Employee;

public class EmployeeServices implements EmployeeDAO {
	
	public void createEmployee(Employee newEmployee) {
		//always the same
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		//create employee
		entitymanager.getTransaction().begin();
		entitymanager.persist(newEmployee);
		entitymanager.getTransaction().commit();
		
		//close manager and factory
		entitymanager.close();
		entitymanagerfactory.close();
		
	}
	public Employee findEmployee(int eid) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		
		//find employee
		Employee foundEmployee = entitymanager.find(Employee.class, eid);
		
		//close mgr & factory
		entitymanager.close();
		entitymanagerfactory.close();
		
		return foundEmployee;
	}
	
	public void updateEmployeeTel(int eid, String tel) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		//update -- insert new tel
		entitymanager.getTransaction().begin();
		Employee foundEmployee = entitymanager.find(Employee.class, eid);
		foundEmployee.settel(tel);
		entitymanager.getTransaction().commit();
		
		
		//close
		entitymanager.close();
		entitymanagerfactory.close();
		

	}
	public void removeEmployee(int eid) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		//delete a record
		entitymanager.getTransaction().begin();
		Employee foundEmployee = entitymanager.find(Employee.class,  eid);
		entitymanager.remove(foundEmployee);
		entitymanager.getTransaction().commit();
		
		//close
		entitymanager.close();
		entitymanagerfactory.close();
	}


}
