package com.jpaTest.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.jpaTest.entities.User;

public class UserServices implements UserDAO {
	
	public void createUser(User newUser) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		//create employee
		entitymanager.getTransaction().begin();
		entitymanager.persist(newUser);
		entitymanager.getTransaction().commit();
		
		//close manager and factory
		entitymanager.close();
		entitymanagerfactory.close();

	}
	
	public void removeUser(int id) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		//delete a record
		entitymanager.getTransaction().begin();
		User foundUser = entitymanager.find(User.class,  id);
		entitymanager.remove(foundUser);
		entitymanager.getTransaction().commit();
		
		//close
		entitymanager.close();
		entitymanagerfactory.close();
	}
	public User findUser(int id) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		
		//find user
		User foundUser = entitymanager.find(User.class, id);
	
		//close mgr & factory
		entitymanager.close();
		entitymanagerfactory.close();
		
		return foundUser;
	}
	public void updateUser(int id, String fname, String lname, String city) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("jpaTest");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();

		//update -- insert new tel
		entitymanager.getTransaction().begin();
		User foundUser = entitymanager.find(User.class, id);
		foundUser.setUserID(id);
		foundUser.setFirstName(fname);
		foundUser.setLastName(lname);
		foundUser.setCity(city);
		entitymanager.getTransaction().commit();
		
		
		//close
		entitymanager.close();
		entitymanagerfactory.close();
		

	}

}
