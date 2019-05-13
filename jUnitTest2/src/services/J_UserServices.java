package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.J_User;

public class J_UserServices implements J_UserDAOI{

	@Override
	public boolean login(J_User j_user) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jUnitTest2");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		String givenEmail = j_user.getEmail();
		String givenPassword = j_user.getPassword();
		
		Query query = manager.createQuery("SELECT u FROM J_User u WHERE u.email = :givenEmail and u.password = :givenPassword");

		query.setParameter("givenEmail",  givenEmail);
		query.setParameter("givenPassword", givenPassword);
		@SuppressWarnings("unchecked")
		List<J_User> list = query.getResultList();

		
		manager.close();
		factory.close();
		
		if (list.size()> 0){
			//check
			System.out.println("user = " + list.get(0).getEmail());
			return true;
		}else
			return false;
	}
	@Override
	public void addUser(String email, String password) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jUnitTest2");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		J_User current = new J_User();
		current.setEmail(email);
		current.setPassword(password);
		manager.persist(current);
		manager.getTransaction().commit();
		
		
		manager.close();
		factory.close();
	}
	@Override
	public void removeUser(String email) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jUnitTest2");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		J_User current = manager.find(J_User.class, email);
		
		manager.remove(current);
		manager.getTransaction().commit();
		
		
		manager.close();
		factory.close();
	}
	
	@Override
	public J_User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<J_User> findUsersByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<J_User> findUsersByZip(String zipcode) {
		// TODO Auto-generated method stub
		return null;
	}








}