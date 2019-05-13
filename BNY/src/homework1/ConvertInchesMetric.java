/**
 * 
 */
package homework1;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class ConvertInchesMetric {

	/**
	 * convert inches to meters
	 */
	public static void main(String[] args) {
		//declare variables
		double inches;
		double meters;
		
		// get user input from keyboard
		System.out.print("Enter number of inches to convert to meters: ");
		Scanner inpt = new Scanner(System.in);
		inches =  inpt.nextDouble();
		
		//calculate conversion and output result
		meters = inches * .0254;
		System.out.println("The result in meters is: " + meters + ".");
		
		}

}
