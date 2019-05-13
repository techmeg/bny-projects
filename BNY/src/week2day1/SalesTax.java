/**
 * 
 */
package week2day1;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class SalesTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//calculate sales tax and print with two decimal places
		
		System.out.print("Enter purchase amount of item: ");//user inputs price
		Scanner inputScanner = new Scanner(System.in);
		double price = inputScanner.nextDouble();
		
		double tax = price * .08875;//calculate the tax
		
		//System.out.printf("The tax is: $%.2f", tax);//print the result
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
		
		
		
		
	
	}

}
