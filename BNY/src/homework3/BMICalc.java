/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class BMICalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables
		double height;
		double weight;
		double bmi;


		//get input from the user
		System.out.println("We're calculating in metric today, so convert your height and weight to meters and kg.");
		System.out.println("Please enter your height in meters.");
		Scanner input = new Scanner(System.in);
		height = input.nextDouble();
		
		System.out.println("Enter your weight in kilos.");
		weight = input.nextDouble();
		//calculate BMI
		bmi=weight/(height*height);
	
		System.out.format("Your body mass index is: %f\n", bmi);
	
	}
}
