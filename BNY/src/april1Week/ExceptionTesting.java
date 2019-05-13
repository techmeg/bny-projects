package april1Week;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide a divisor: ");

		
		try {
			int number = input.nextInt();
			int i = 1/number;
			System.out.println("Result is: " + i);
			
			int[] numbers = {1, 2, 3, 4, 5};
			System.out.println(numbers[7]);
		}

		catch (ArithmeticException e) {
		//	e.printStackTrace();  use to find possible errors, 
		//take out after you figure out what happened
			System.out.println("An arithmetic division error occured, dividing by zero.");
		}
		catch (InputMismatchException e) {
			System.out.println("Please provide a number.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The highest index you can choose is 4");
		}
		finally {
			System.out.println("That's it! You tried your best");
			input.close();
		}
		System.out.println("outside the try/catch");
	}

}
