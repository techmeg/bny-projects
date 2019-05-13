package daoExercise;

import java.util.List;

public interface StudentDAO  {
	//set body-less methods
	
	public void updateStudent(int rollNo, String sName);
	
	public void deleteStudent(int rollNo);
		
	public void addStudent(String name);

	public Student getStudent(int rollNo);
	
	public void printStudent(int rollNo);
	
	public void printAllStudents();

	
	public List<Student> getAllStudents();
	
}
