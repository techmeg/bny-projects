/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class subtractionProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize variables
		int rightAnswers = 0;
		int problems = 0;
		
		//subtraction problem using a while loop
		while (problems<5) {	
			int num1 = (int)(Math.random()*10) + 1;
			int num2 = (int)(Math.random() * 10) + 1;
			int result = num1 - num2;
			
					
			System.out.println("What is the result of the expression: " + num1 + " - " + num2);
			Scanner input = new Scanner(System.in);
			int guess = input.nextInt();
			problems++;
			
			if (guess == result) {
				rightAnswers++;
			
					
			}
		}System.out.println("The number of correct answers is: " + rightAnswers);
		
		
	}

}
