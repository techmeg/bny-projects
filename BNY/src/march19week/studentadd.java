/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class studentadd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = (int)(Math.random()*10) + 1;
		int num2 = (int)(Math.random() * 10) + 1;
		int result = num1 + num2;
		int guess;
		//alt way for random, call Random class
		//Random rand = new(Random();
		//num1 = rand.nextInt(10);
		
		
		System.out.println("Hi! What's the result of " + num1 + " + " + num2 + " ?");
		Scanner input = new Scanner(System.in);
		guess = input.nextInt();
		
		if (guess==result) 
			System.out.println("Yes! Good job");
		 else 
			System.out.println("Nope, keep studying");
		//{} around statement blocks are optional BUT NOT a good practice!
		// because if there is a next statement it will be outside of the condition and could execute falsely
		
	}
	

}
