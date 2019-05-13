/**
 * 
 */
package homework1;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class Multiply {

	/**
	 * Multiply two numbers
	 */
	public static void main(String[] args) {
		// declare variables
		int input1;
		int input2;
		int result;
		
		//get user inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number to multiply: ");
		input1=input.nextInt();
		
		System.out.print("Enter second number to multiply: ");
		input2=input.nextInt();
		
		//calculate product and output result
		result = input1 * input2;
		System.out.println("The result is: " + result + ".");
	}

}
