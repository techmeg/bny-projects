package daoExercise;

import java.util.Scanner;

public class MainStudent  {

	public static void main(String[] args) {
		// instantiate interface object

		StudentDAO studentDAO = new StudentDAOImpl();
		//print all students
		studentDAO.getAllStudents();
		for(Student student : studentDAO.getAllStudents()) {
			System.out.println("Student, RollNo: " + student.getsRollNo() + " Name: " + student.getsName() );
		}
		//business user requests desired option
		System.out.println("\nWhat would you like to do? Enter 1, 2, 3, 4, 5, or 6.");
		System.out.println("1. Update Student.");
		System.out.println("2. Delete Student.");
		System.out.println("3. Add Student.");
		System.out.println("4. See One Student.");
		System.out.println("5. See All Students.");
		System.out.println("6. Exit System.");
		
		//options are executed according to user choice
		Scanner input = new Scanner (System.in);
		int select = input.nextInt();
		
		switch (select){
		
		case 1: System.out.println("Enter the Roll No of the student to update.");
				int rollNo = input.nextInt();
				System.out.println("Enter new student name");
				String sName = input.next();
				studentDAO.updateStudent(rollNo, sName);
				break;
		
		case 2: System.out.println("Enter the Roll No of the student to delete.");
				rollNo = input.nextInt();		
				studentDAO.deleteStudent(rollNo);
				break;
				
		case 3: System.out.println("Enter the name of the student to add.");
				sName = input.next();
				studentDAO.addStudent(sName);
				break;
				
		case 4: System.out.println("Enter the Roll No of the student to review.");
				rollNo = input.nextInt();
				studentDAO.printStudent(rollNo);
				break;
				
		case 5: studentDAO.printAllStudents();
				break;
		
		case 6: break;
		
		}input.close();
	}

}
