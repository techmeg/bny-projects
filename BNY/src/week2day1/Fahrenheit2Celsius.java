/**
 * 
 */
package week2day1;

import java.util.Scanner;

import org.omg.CORBA.Request;

/**
 * @author margaret.parsons
 *
 */
public class Fahrenheit2Celsius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Convert fahrenheit temperature to celsius
		
		double fahrenheit;
		
		System.out.print("Enter temperature in fahrenheit: ");//request temperature input
		Scanner input = new Scanner(System.in);
		fahrenheit = input.nextDouble();
		
		double celsius = (5d/9) * (fahrenheit - 32);//convert to celsius
		
		System.out.println(celsius);//print result

	}

}
