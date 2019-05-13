package Services;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpqlTestEntities.Employee;



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
	
	//use jpql to make the query
	public void getAllEmployees() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpqlTest");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("SELECT e FROM Employee e");
		List<Employee> employees = query.getResultList();
		
		for(Employee e : employees) {
			System.out.println(e.toString());
		}
	}
	
	 //use JPQL to select one user using a parametr
	  public void getEmployee() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpqlTest");
		EntityManager manager = factory.createEntityManager();
		
		//givenID is a parameter, which you set in the next line or can be passed in to function
		Query query = manager.createQuery("SELECT e FROM Employee e WHERE e.userID = :givenID");
		query.setParameter("givenID",  1);
		List<Employee> employees = query.getResultList();
	
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
	  }
	  //use Named Query instead of writing in JPQL directly
	  public void getNamedQEmployee() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpqlTest");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createNamedQuery("Find Employee by ID");
		query.setParameter("id",  1);
		List<Employee> employees = query.getResultList();

		for (Employee e : employees) {
			System.out.println(e.toString());
	  }
	  }



}
