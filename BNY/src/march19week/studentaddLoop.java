/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class studentaddLoop {

	/**
	 * arithmetic practice
	 */
	public static void main(String[] args) {
		// initialize variables
		
		int num1 = (int)(Math.random()*10) + 1;
		int num2 = (int)(Math.random() * 10) + 1;
		int result = num1 + num2;
		int guess;
		boolean flag = true;
		//alt way for random, call Random class
		//Random rand = new(Random();
		//num1 = rand.nextInt(10);
		
		//set condition such that question repeats until a right answer is given
		while(flag) {
		System.out.println("Hi! What's the result of " + num1 + " + " + num2 + " ?");
		Scanner input = new Scanner(System.in);
		//catch error if user enters non-numeric answer
		try {
		guess = input.nextInt();
		}catch (Exception e) {
			System.out.println("***** Error, only numbers please ******");
			input.nextLine();
			continue;
		}
		
		if (guess==result) {
			System.out.println("Yes! Good job!");
			flag = false;
		}//change flag to false to stop loop when correct answer is provided
		 else {
			System.out.println("Not quite, try again.");
		 }//otherwise, ask again
		}

		
	}
	

}
