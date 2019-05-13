/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class DataMining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables
		int grade;
		int id;
		double gpa;

		System.out.println("Please enter the following information so I can sell it at a profit!!");

		//get input from the user
		System.out.println("Please enter your first name as a string (i.e., letters only)");
		Scanner input = new Scanner(System.in);
		String fname = input.next();
		
		System.out.println("Please enter your last name as a string");
		String lname = input.next();
		
		System.out.println("What grade (9-12) are you in? (integer please!)");
		grade = input.nextInt();
		
		System.out.println("What is your student ID# (integer please!)");
		id = input.nextInt();
		
		System.out.println("Please enter your username/login as a string");
		String login = input.next();
		
		System.out.println("What is your grade point average?");
		gpa = input.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("Login: " + login + "\nID: " + id + "\nName " + fname + " " + lname);
		System.out.println("GPA: " + gpa + "\nGrage " + grade);
		
		
	
		
		
		
		//System.out.println (name);
	}

}
