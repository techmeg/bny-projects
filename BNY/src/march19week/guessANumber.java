/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class guessANumber {

	/**
	 * user guesses a number
	 */
	public static void main(String[] args) {
		// initialize variables
		
		int number = (int)(Math.random()*100) + 1;
		
		int guess = 101;
		
		
		//set condition such that question repeats until a right answer is given
		while(guess != number) {
		System.out.println("Hi! Try to guess my random number between 0 and 100.");
		Scanner input = new Scanner(System.in);
		//catch error if user enters non-numeric answer
			try {
			guess = input.nextInt();
			}catch (Exception e) {
				System.out.println("***** Error, only numbers please ******");
				input.nextLine();
				continue;
			}
		//give user feedback to guess more correctly
			if (guess > number) {
			System.out.println("Your guess is too high. Try again.");	
			} else if (guess < number) {
				System.out.println("Your guess is too low. Try again.");
			}

			
		 }System.out.println("That's it! Random number: " + number + ".  Your guess: " + guess);
		}

		
	}
	
