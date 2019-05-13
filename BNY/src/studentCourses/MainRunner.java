/**
 * 
 */
package studentCourses;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author margaret.parsons
 *
 */
public class MainRunner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Course c1 = new Course (1, "Core Java");
		Course c2 = new Course (2, "Python");
		Course c3 = new Course (3, "HTML");
	
		List<Course> l1 = new ArrayList<Course>();
		l1.add(c2);
		l1.add(c3);
		
		Student s1 = new Student(1, "Maria", l1);
//		Student s2 = new Student( 2, "Jack", new ArrayList<>());
		s1.printStudent();
		
		System.out.println("Which course do you want to drop?");
		Scanner input = new Scanner(System.in);
		String dropCourse = input.nextLine();
		
		s1.dropCourse(dropCourse);
		s1.printStudent();
		
		input.close();
		

		
		

		}
		
	}

