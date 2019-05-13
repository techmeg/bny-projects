/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class Agein5yrs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables
		int age;


		//get input from the user
		System.out.println("So, old-timer, what's your name?");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		System.out.println("Nice to meet you, " + name + ", I'm Java");
		System.out.println("How old are you?");
		age = input.nextInt();
		
		System.out.println("So, five years from now you'll be "  + (age+5) + "? That's OLD!");
		System.out.println("And remember five years ago when you were " + (age-5) + "? Yeah, hard to remember, huh?");
	}
}
