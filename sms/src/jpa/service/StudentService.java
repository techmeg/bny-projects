package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.StudentDAO;
import jpa.entity.models.Course;
import jpa.entity.models.Student;


public class StudentService implements StudentDAO{

	@Override
	public List getAllStudents() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Query query = manager.createQuery("SELECT s FROM Student s");
		@SuppressWarnings("unchecked")
		List<Student> students = query.getResultList();
		System.out.println("Email \t Student NAME \t Password");

		for (Student s : students) {
			System.out.println(s.getsEmail() + " " + s.getsName() + " " +s.getsPass());
		}
		manager.close();
		factory.close();
		return students;
		
	}

	@Override
	public Student getStudentByEmail(String email) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
		EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			Student foundStudent = manager.find(Student.class, email);
			System.out.println(foundStudent.getsEmail());

			manager.close();
			factory.close();
			return foundStudent;

	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean validateStudent(String email, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("SELECT student FROM Student student WHERE student.sEmail = :givenEmail AND student.sPass = :givenPass");
		query.setParameter("givenEmail", email);
		query.setParameter("givenPass", password);
		List<Student> students = query.getResultList();
		manager.close();
		factory.close();
		if (students.size()>0) {
			System.out.println("Student is valid");
			return true;
		}else {
			System.out.println("Wrong credentials");
			return false;
		}

	}

	@Override
	public void registerStudentToCourse(int cId, String sEmail) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		//find student and course
		Course newCourse = manager.find(Course.class, cId);
		Student student = manager.find(Student.class, sEmail);
		//get student course list
		List<Course> scourses =student.getsCourses();
		if(scourses.contains(newCourse)) {
			System.out.println("You are already registered for that course");
		}else {
			//add course to course list and persist/commit transaction
			scourses.add(newCourse);
			manager.persist(student);
			manager.getTransaction().commit();
			
			//close mgr/factory
			manager.close();
			factory.close();
		}

	}

	@Override
	public List getStudentCourses(String email) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		//find student
		Student s1 = manager.find(Student.class, email);
		List <Course> clist = s1.getsCourses();
		System.out.println("Your courses are:\n");
		System.out.printf("%-10s %-30s %-30s \n", "COURSE ID", "COURSE NAME", "INSTRUCTOR NAME");
		for (Course c : clist) {
			System.out.printf("%-10s %-30s %-30s \n", c.getcId(),c.getcName(), c.getcInstructorName());
		}
		//close mgr/factory
		manager.close();
		factory.close();
		return clist;
	}
	
	public static void addStudent() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sms");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Student s2 = new Student();
//		s1.setsEmail("mlp@nyc.rr.com");
//		s1.setsName("meg");
//		s1.setsPass("pass")
		manager.persist(s2);
		manager.getTransaction().commit();
		
		//close mgr/factory
		manager.close();
		factory.close();
		
	}

}
