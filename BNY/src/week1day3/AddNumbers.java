package week1day3;
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// Add two numbers together
		double number1;
		double number2;
		double sum;
		
		System.out.println("Input first number for addition: "); //ask user for first number.
		Scanner input = new Scanner(System.in);
		number1 = input.nextDouble();
		
		System.out.println("Input second number for addition."); //ask user for second number.
		number2 = input.nextDouble();
				
		sum = number1 + number2;//adding numbers
		
		
		System.out.println("The result is " + sum + ".");//Outputting the result.
	}

}
