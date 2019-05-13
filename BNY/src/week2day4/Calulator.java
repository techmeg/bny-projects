/**
 * 
 */
package week2day4;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * @author margaret.parsons
 *
 */
public class Calulator {

	/**
	 * Calculate using two operands supplied by the user and output product
	 */
	
	
	public static void main(String[] args) {
		// ask user to choose an operation to perform
		System.out.println("What would you like to do? Add, Subtract, Multiply or Divide?\n");
		System.out.println("For Addition, enter 1.\nFor Subtraction, enter 2. \nFor Multiplication, enter 3. \nFor Division, enter 4.");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		//declare variables
		double operand1;
		double operand2;
		
		//initialize result
		double result = 0;
		
		//determine which operations is selected and request the user to input the operands
		if (choice == 1) {
			System.out.println("Enter two numbers to add together.");
		}
		else if (choice == 2) {
			System.out.println("Enter two numbers to subtract.");
		}
		else if (choice == 3) {
			System.out.println("Enter two numbers to multiply.");
		}
		else if (choice == 4){
			System.out.println("Enter two numbers to divide.");
		}
		else {
			System.out.println("The only valid choices are 1, 2, 3 or 4. Please enter one of these digits.");
		}
		 operand1 = input.nextDouble();
		 operand2 = input.nextDouble();
		
	
		 //perform calculation and output result
		if (choice == 1) {
			result = operand1 + operand2;
		} else if (choice == 2) {
			result = operand1 - operand2;
		} else if (choice == 3) {
			result = operand1 * operand2;
		} else if (choice == 4) {
			result = operand1 / operand2;
		}
		
		System.out.println("The result is " + result + ".");
	}
}

