/**
 * 
 */
package airplanehomework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author margaret.parsons
 * check for available blocks of seats on an airplane
 */
public class reserveSeatsALT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare a 2D array with rows A-Z and cols 1-10 to represent airplane seats
		// xxx aisle xxxx aisle xxx
		
		boolean[][]airplane = new boolean [26][10];
		String seatsTaken = "A4, A10, C5, D3, E6, F8";
		seatsTaken.replaceAll("\\s",  "");//delete spaces from string
 
/*		System.out.println("Enter a random number of seats taken using the format A#, where \n"
				+ "A is a capital letter from A-Z and # is a number from 0-9, and each seat number \n"
				+ "is separated by a comma. For example, A1, A2, C9, D4, D5, Z8, Z9");
		Scanner input = new Scanner(System.in);
		//save input to seatsTaken
		String seatsTaken = input.nextLine();*/
		
		
		//split string to array of seats
		String seats [] = seatsTaken.split(",");
		System.out.println(Arrays.toString(seats));
		
		//Set filled seats to 1
		for (int i=0; i<seats.length; i++) {
			String temp = seats[i];
			
			}
		}
		//check cols0-2 and 7-9 for filled seats; if row empty, increase count
		int availSeats = 0;
		int availRows = 78;
		
		//alt solution: if(airplane[i][j]==1 && airplane[i][j+1]==1 && airplane[i][j+2]==1
		//  if airplane[i][j+3]==1 && airplane[i][j+4]==1 && airplane[j+5]==1
		// if airplane[i][j+4} [j+5], [j+6]==1 and 7-9 all in the same loop
		for (int i=0; i<26; i++ ) {
			for (int j=0; j<=2; j++) {
				if (airplane[i][j]==1) {
					j=3;
					availRows--;
				}
			}
			
			for (int j=7; j<=9; j++) {
				if (airplane[i][j]==1) {
					j=10;
					availRows--;
				}
			}
		}//check cols 3-6 for seats taken
		int taken = 0;
		for (int i=0; i<26; i++) {
			for (int j=3; j<=6; j++) {
				if (airplane[i][j]==1) {
					taken++;
				}
			}if (taken>=2)  {
				availRows--;
				taken=0;
			}else if ((airplane[i][4]==1) || (airplane[i][5]==1)) {
				availRows--;
				taken=0;
			}else {
				taken=0;
			}
		}
		System.out.println("There are " + availRows + " available 3-seat combinations.");
		

	}
}


