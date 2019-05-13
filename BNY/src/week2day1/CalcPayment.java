/**
 * 
 */
package week2day1;

import java.util.Scanner;

import org.omg.IOP.TaggedComponentHelper;

/**
 * @author margaret.parsons
 *
 */
public class CalcPayment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calculate monthly payment based on user input
		double monthPmt;
		double loanAmt;
		int numYrs;
		double monthIntRate;
		
		System.out.println("Enter the loan amount: ");//user enters loan amount
		Scanner input = new Scanner(System.in);
		loanAmt = input.nextDouble();
	
		System.out.println("Enter the monthly interest rate: ");//user enters interest rate
		monthIntRate = input.nextDouble();
		monthIntRate = monthIntRate/1200.0;
		
		System.out.println("Enter the term of the loan in years: ");//user enters loan term
		numYrs = input.nextInt();
	
		//calculate loan payment
		monthPmt =  loanAmt * monthIntRate  / ( 1 - 1/Math.pow(1 + monthIntRate, numYrs*12));
		System.out.printf("The monthly payment is: $%,.2f",  monthPmt);
		
		double fullPayment = monthPmt*numYrs*12;
		
		System.out.printf("\n The full payment is $%,.2f",  fullPayment);
		
		
		

	}

}
