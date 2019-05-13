/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class subtractionProblems2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize variables
		int count = 0;
		
		//subtraction problem using a for loop
		
		for (int i=1; i<=5; i++) {	
			int num1 = (int)(Math.random()*10) + 1;
			int num2 = (int)(Math.random() * 10) + 1;
			int result = num1 - num2;
			int guess= 100;
				
	
			System.out.println("What is the result of the expression: " + num1 + " - " + num2);
			Scanner input = new Scanner(System.in);
			guess = input.nextInt();
			
			if (guess == result) {
				count++;
					
			}
		}System.out.println("The number of correct answers is: " + count);
		
		
	}

}
