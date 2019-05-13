package daoExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAOImpl implements StudentDAO {
	//TODO -- figure out why delete students won't execute after taking in Y
	
	//declare List of students
	List<Student> students;
	
	//put the list inside the constructor and add elements
	public StudentDAOImpl() {
		students = new ArrayList<Student>();
	Student s1 = new Student ("Bob", 0);
	Student s2 = new Student ("Jane", 1);
	Student s3 = new Student ("Max", 2);
	students.add(s1);
	students.add(s2);
	students.add(s3);
	}

	//get the list of students
	@Override
	public List<Student> getAllStudents() {
		return students;
	}
	//get one student by roll No
	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}
	
	//remove a student
	public void deleteStudent(int rollNo) {
		 students.remove(rollNo);
		 System.out.println("Student at Roll No " + rollNo + " has been removed.");
		 System.out.println("Would you like to see the updated list of students? Y/N");
		 Scanner input = new Scanner(System.in);
		 String temp = input.next();
		 if (temp == "Y") {
			 System.out.println(temp); // this does not execute -- why?
			 for(Student student :getAllStudents()) {
					System.out.println("Student, RollNo: " + student.getsRollNo() + ", Name: " + student.getsName() );
			 }
		 }input.close();
	}
	
	//update a student by roll no
	public void updateStudent(int rollNo, String sName) {
		students.get(rollNo).setsName(sName);
		printStudent(rollNo);
	}
	
	//print out one student by roll no
	public void printStudent(int rollNo) {
		 System.out.println("Student, RollNo: " + getStudent(rollNo).getsRollNo() + ", Name: " + getStudent(rollNo).getsName());
	}
	
	//print out list of students
	public void printAllStudents() {
		getAllStudents();
		for (Student s : students) {
			System.out.println("Student, RollNo: " + s.getsRollNo() + " Name: " + s.getsName() );
			
		}
	}
	
	//add a student to the list
	  public void addStudent(String name) {
		  int index = students.size();
		  System.out.println(index);
		
		  Student student = new Student(name,index);
		  students.add(student); 
		  printStudent(index);
//		  printAllStudents();
		 
	  }
	 
	
	
}


	

