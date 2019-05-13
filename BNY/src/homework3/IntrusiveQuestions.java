/**
 * 
 */
package homework3;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

/**
 * @author margaret.parsons
 *
 */
public class IntrusiveQuestions {

	/**
	 * Ask somewhat insulting and intrusive questions and make spurious comments to a user
	 */
	public static void main(String[] args) {
		//declare variables
		
		int age;
		double wage;
		
		//get user input from keyboard by asking personal questions
		System.out.println("Hello. What's your name?");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		System.out.format("Hi, %s. What is your age?\n", name);/*note: if user enters a 
		string by mistake, program will fail*/
		
		age = input.nextInt();
		
		System.out.println("So, you're " + age + ", huh? That's not old at all! \nHow much do you make?");
		wage = input.nextDouble();//this one too -- string will make it fail
		
		//patronize the user by commenting on their age and salary
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.printf(nf.format(wage), wage);

		System.out.println(" That's really good for " + age + "!"); 
		
		
		
	}

}
