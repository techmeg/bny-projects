package MTOMain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entities.Department;
import Entities.Teacher;

public class OTMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mOneToMany");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Teacher teacher1 = new Teacher(1, "Mike", 60000);
		manager.persist(teacher1);
		
		Teacher teacher2 = new Teacher(2, "Bairon", 80000);
		manager.persist(teacher2);
		
		List<Teacher>teacherList = new ArrayList<Teacher>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		
		Department dept1 = new Department(1, "Test Department", teacherList);
		manager.persist(dept1);
		

		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		System.out.println("success");

	}

}
