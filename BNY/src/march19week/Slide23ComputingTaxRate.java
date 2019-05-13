/**
 * 
 */
package deck8;
import java.util.Scanner;
/**
 * @author melanie.pruneda
 *
 */
public class Slide23ComputingTaxRate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int filingStatus = 0;
		double income = 0;
		double taxRate = 0;
		double taxDue;
		
		Scanner input = new Scanner(System.in);
		
		/*
		 * while loop to repeat options until 1-4 is entered filingStatus was
		 * initialized to 0 conditional says "while filingStatus is NOT between 1 and 4"
		 */
		while (!(filingStatus >= 1 && filingStatus <= 4)) {
			System.out.println("Please enter your filing status:");
			System.out.println("[1] for Single");
			System.out.println("[2] for Married Filing Jointly or Qualifying Widow(er)");
			System.out.println("[3] for Married Filing Separately");
			System.out.println("[4] for Head of Household");
			/*
			 * try-catch block to handle input that is not an integer 
			 * non-integer throws InputMismatchException
			 * catch block prints error message, resets Scanner token, and continues loop
			 */
			try {
				filingStatus = input.nextInt();
			} catch (Exception e) {
				System.out.println("************Error: Must be a number 1 through 4************\n");
				input.nextLine(); // need this to reset Scanner token, otherwise infinite loop
				continue;
			}
		}
		/*
		 * while loop to repeat income prompt until a positive number is entered
		 * income was initialized to 0 
		 */
		while (income <= 0) {
			System.out.println("Please enter your taxable income:");
			/* 
			 * try-catch block to handle input that is not a double 
			 * non-double throws InputMismatchException
			 * catch block prints error message, resets Scanner token, and continues loop */
			try {
				income = input.nextDouble();
			} catch (Exception e) {
				System.out.println("************Error: Must be a number************\n");
				input.nextLine(); // need this to reset Scanner token, otherwise infinite loop
				continue;
			}
			
		}
		// calculate tax rate if single
		if (filingStatus == 1) {
			if (income <= 8350) {
				taxRate = .1;
			} else if (income > 8350 && income <= 33950) {
				taxRate = .15;
			} else if (income > 33950 && income <= 82251) {
				taxRate = .25;
			} else if (income > 82251 && income <= 171550) {
				taxRate = .28;
			} else if (income > 171551 && income <= 372950) {
				taxRate = .33;
			} else if (income > 372950) {
				taxRate = .35;
			}
		// calculate tax rate if married filing jointly
		} else if (filingStatus == 2) {	
			if (income <= 16700) {
				taxRate = .1;
			} else if (income > 16700 && income <= 67900) {
				taxRate = .15;
			} else if (income > 67900 && income <= 137050) {
				taxRate = .25;
			} else if (income > 137050 && income <= 208850) {
				taxRate = .28;
			} else if (income > 208850 && income <= 372950) {
				taxRate = .33;
			} else if (income > 372950) {
				taxRate = .35;
			}
		// calculate tax rate if married filing separately
		} else if (filingStatus == 3) {
			if (income <= 8350) {
				taxRate = .1;
			} else if (income > 8350 && income <= 33950) {
				taxRate = .15;
			} else if (income > 33950 && income <= 68525) {
				taxRate = .25;
			} else if (income > 68525 && income <= 104425) {
				taxRate = .28;
			} else if (income > 104425 && income <= 186475) {
				taxRate = .33;
			} else if (income > 186476) {
				taxRate = .35;
			}
		// calculate tax rate if head of household
		} else if (filingStatus == 4) {
			if (income <= 11950) {
				taxRate = .1;
			} else if (income > 11950 && income <= 45500) {
				taxRate = .15;
			} else if (income > 45500 && income <= 117450) {
				taxRate = .25;
			} else if (income > 117450 && income <= 190200) {
				taxRate = .28;
			} else if (income > 190200 && income <= 372950) {
				taxRate = .33;
			} else if (income > 372950) {
				taxRate = .35;
			}
		} 
		// output tax rate, income and tax due
		System.out.printf("\nYour tax rate is: %.0f percent", (taxRate*100));
		System.out.printf("\nYour taxable income is: $%,.2f ", income);
		System.out.printf("\nYour tax due is: $%,.2f", (income * taxRate));
		
	}	
}
