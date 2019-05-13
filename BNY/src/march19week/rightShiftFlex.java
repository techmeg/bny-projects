/**
 * 
 */
package march19week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 *
 */
public class rightShiftFlex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create temp array to hold end elements
		
		int [] myArray = {6, 5, 4};
		int [] tempArray = new int[myArray.length];
		int shift = 2;
		int j = 0; 
		//store last two values in variables
		for (int i=myArray.length-shift; i<myArray.length; i++) {
			
			tempArray[j] = myArray[myArray.length-shift+j];
			j++;
			System.out.println(Arrays.toString(tempArray));
		}
		//shift values two positions to the right
		for (int i = myArray.length-1-shift; i>=0; i--) {
			myArray[i+shift] = myArray[i];
		}
		
		for (int i=0; i<shift; i++) {
			myArray[i]=tempArray[i];
		}

		System.out.println(Arrays.toString(myArray));

	}
		
}


