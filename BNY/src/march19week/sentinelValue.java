/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 * sum user provided numbers until user provides a zero
 */
public class sentinelValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize variables to store sum and the expression of the numbers offered
		// initialize sentinel to number != zero
		
		double sum = 0;
		String expression = "";
		double sentinel = 1;
		
		Scanner input = new Scanner(System.in);
		//Ask user to supply a numbers to sum until user offers zero
		while(sentinel !=0) {
			System.out.println("Please provide a number to sum.");

			try {
			sentinel = input.nextDouble();
			}catch (Exception e) {
				System.out.println("*** Error, enter a NUMBER please ***");
				input.nextLine();
				continue;
			}
			
			sum= sum+sentinel;//add number to sum
			expression = expression + sentinel + "+"; //store each number in expression
			//print out the string of numbers offered and the sum of them

		}System.out.printf("Sum " + expression + " is %.2f", sum);
		input.close();//closing my scanner!

	}

}
