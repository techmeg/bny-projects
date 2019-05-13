/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 * find greatest common divisor between two numbers
 */
public class greatestCommonDivisor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a positive integer");
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		System.out.println("Enter another positive integer");		
		int num2 = input.nextInt();
		
		int gcd = 1;
		
		for (int i=1; i<=num1 && 1<=num2; i++) {
		 if (num1 % i == 0 && num2 % i == 0) {
			 gcd = i;
		 }
		}System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd);
		
	}

}
