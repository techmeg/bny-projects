/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class DumbCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables
		double num1;
		double num2;
		double num3;


		//get input from the user
		System.out.println("Please enter a number.");
		Scanner input = new Scanner(System.in);
		num1 = input.nextDouble();
		
		System.out.println("and another number, please.");
		num2 = input.nextDouble();
		
		System.out.println("and a third number, please.");
		num3 = input.nextDouble();
		
		System.out.format("The result of %f + %f + %f / 2 is:\n", num1, num2, num3);
		System.out.println((num1+num2+num3)/2);
	
	}
}
