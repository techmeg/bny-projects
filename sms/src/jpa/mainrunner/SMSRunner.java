package jpa.mainrunner;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.PersistenceException;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	public static void main(String[] args) {
		
		StudentDAO ss = new StudentService();
		CourseDAO cs = new CourseService();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello. Please enter:");
		System.out.println("1. If you are a student.");
		System.out.println("2. to Quit.");
		
		//catch database connection error
		try {
			int go = input.nextInt();
			if(go > 2) {
				System.out.println("Invalid Entry");
			}else if (go == 2) {
				System.out.println("This system is for students. Goodbye!");
			}else {
				//student enters email and password -- catch for NullPointerException
		
					System.out.println("Enter your Email, please");
					String email = input.next();
					System.out.println("Enter your password, please");
					String password = input.next();
					
				//email and password are validated -- or  would be if this worked
					ss.validateStudent(email, password); 
				//ummmm...I return a boolean value, but I don't see how to use it...:(	
					//show list of student courses
					ss.getStudentCourses(email);
				
				//ask if student would like to register for more classes -- catch InputMismatchException
		
					System.out.println("Would you like to register for more courses?");
					System.out.println("Enter 1 to register. Enter 2 to logoout");
					int select = input.nextInt();
					switch (select) {
					case 1: cs.getAllCourses();
		
							System.out.println("Enter the ID# of the course to add.");
							int cId = input.nextInt();
							ss.registerStudentToCourse(cId, email);
							ss.getStudentCourses(email);
							break;
					case 2: System.out.println("Bye!");
					default: break;
					}
				}//catch exceptions for keyboard errors, database mismatch
			}catch (InputMismatchException e) {
				System.out.println("Invalid entry");
			}catch (NullPointerException e) {
				System.out.println("Invalid ID or password");
			}catch (PersistenceException e) {
				System.out.println("Unable to connect to database");
			}input.close();

	}

}
