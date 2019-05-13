package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.CourseDAO;
import jpa.entity.models.Course;

public class CourseService implements CourseDAO {

//	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
//	static EntityManager manager = factory.createEntityManager();
	
	@Override
	public void getAllCourses() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query = manager.createQuery("SELECT c FROM Course c");
		@SuppressWarnings("unchecked")
		List<Course> courses = query.getResultList();
		System.out.println("All Courses: \n");
		System.out.printf("%-10s %-30s %-30s\n", "ID", "COURSE NAME", "INSTRUCTOR NAME");

		for (Course c : courses) {
			System.out.printf("%-10s %-30s %-30s\n", c.getcId(), c.getcName(), c.getcInstructorName());
		}
		manager.close();
		factory.close();
	
	}
	public static void addCourse() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Course c1 = new Course();
		manager.persist(c1);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
//	public static void closeConnection() {
//		manager.close();
//		factory.close();
//	}

}
