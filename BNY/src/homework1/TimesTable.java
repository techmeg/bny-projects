/**
 * 
 */
package homework1;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class TimesTable {

	/**
	 * multiply any number by 1 through 10
	 */
	public static void main(String[] args) {
		//declare variables
		int input1;
		int i = 1;
		int result = 0;
		
		// get user input
		System.out.print("Enter a number: ");
		Scanner input  = new Scanner(System.in);
		input1 = input.nextInt();
		
		//multiply input times 1 through 10 and print the resulting equations
		while (i < 11) {
			result = input1*i;
			System.out.println(i + " x " + input1 + " = " + result);
			i++;
			
			
		}
		

	}

}
