package week2day1;

import java.awt.Dimension;
import java.lang.invoke.ConstantCallSite;
import java.util.Scanner;

/*
 * author: Meg Parsons
 */ 
public class ChangeAdollar {

	// Break a dollar amount into dollars and coins.*/
	
	public static void main(String[] args) {

		
		//declare constants
		final float QUARTER = 25.0f;
		final float DIME = 10.0f;
		final float NICKEL = 5.0f;
		final float PENNY = 1.0f;
		
		System.out.println("Enter a dollar amount.");//get user input
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();

		
		int dollar = (int)amount;//calculate each denomination
		amount = (amount - dollar) * 100;
		
		double rem1 = amount/QUARTER;
		int quarters = (int)rem1;
		amount = amount - (quarters * 25.0);

		double rem2 = amount/DIME;
		int dimes = (int)rem2;
		amount = amount - (dimes * 10);
		
		double rem3 = amount/NICKEL;
		int nickels = (int)rem3;
		amount  = amount - (nickels * 5);
		
		int pennies = (int)amount;
		
		//print resulting table
		System.out.println("Dollars\tQuarters\tDimes\tNickels\tPennies \n");
		System.out.println(dollar + "\t" + quarters + "\t\t" + dimes + "\t" + nickels + "\t" + pennies);
		
		amount = amount-pennies;
		System.out.println("\n\nThe bank keeps: " + amount/100 + " cents.");
	}

}
