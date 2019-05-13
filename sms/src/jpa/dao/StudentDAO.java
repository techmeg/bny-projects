package jpa.dao;

import java.util.List;

import jpa.entity.models.Student;

public interface StudentDAO {
	
	public List getAllStudents();
	
	public Student getStudentByEmail(String email);
	
	public boolean validateStudent(String email, String password);
	
	public void registerStudentToCourse(int cId, String sEmail);
	
	public List getStudentCourses(String email);

}
