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
public class reserveSeats {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare a 2D array with rows A-Z and cols 1-10 to represent airplane seats
		// xxx aisle xxxx aisle xxx
		
		int[][]airplane = new int [26][10];
	//	System.out.println(Arrays.deepToString(airplane));

		//fill array rowNames with A-Z
		char[] rowNames = new char[26];
        int index = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            rowNames[index++] = c;
        }System.out.println(rowNames);
        
        //fill colNames with 0-9
        index = 0;
        char[]colNames = new char[10];
        for (char c='0'; c<='9'; c++) {
        	colNames[index++] = c;
        }System.out.println(colNames);
		
		System.out.println("Enter a random number of seats taken using the format A#, where \n"
				+ "A is a capital letter from A-Z and # is a number from 0-9, and each seat number \n"
				+ "is separated by a comma. For example, A1, A2, C9, D4, D5, Z8, Z9");
		Scanner input = new Scanner(System.in);
		//save input to seatsTaken
		String seatsTaken = input.nextLine();
		//split string to array of seats
		String seats [] = seatsTaken.split(",");
		System.out.println(Arrays.toString(seats));
		
		//Set filled seats to 1
		for (int i=0; i<seats.length; i++) {
			char[]temp = new char[2];
			temp = seats[i].trim().toCharArray();
			
			for (int j=0; j<rowNames.length; j++) {
				if (temp[0] == rowNames[j]) {
					for (int k=0; k<colNames.length; k++) {
						if (temp[1] == colNames[k]) {
							airplane[j][k]= 1;
						}
					}
					
				}
			}
		}
		//check cols0-2 and 7-9 for filled seats; if row empty, increase count
		int availSeats = 0;
		int availRows = 78;
		
		//alt solution: if(airplane[i][j]==1 && airplane[i][j+1]==1 && airplane[i][j+2]==1
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


