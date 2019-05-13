/**
 * 
 */
package week2day1;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class CalcHoursMins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// translate number of minutes into hours and minutes
		
		System.out.print("Enter the number of minutes: ");//get user to input number of minutes
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		int hours;//calculate hours
		hours = minutes / 60;

		int remainminutes = minutes % 60;//calculate remaining minutes
		

		System.out.println(minutes + " Minutes is " + hours + " hours and " + remainminutes + " minutes.");

	}

}
