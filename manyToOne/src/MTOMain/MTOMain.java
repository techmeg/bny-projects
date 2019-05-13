package MTOMain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entities.Department;
import Entities.Teacher;

public class MTOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("manyToOne");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Department dept1 = new Department(1, "Test Department");
		manager.persist(dept1);
		
		Teacher teacher1 = new Teacher(1, "Mike", 60000, dept1);
		manager.persist(teacher1);
		
		Teacher teacher2 = new Teacher(2, "Bairon", 80000, dept1);
		manager.persist(teacher2);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		System.out.println("success");

	}

}
