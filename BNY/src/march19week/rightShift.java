/**
 * 
 */
package march19week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 *
 */
public class rightShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// shift array elements two positions to the right
		
		int [] myArray = {6, 5, 4, 3, 2, 1};
		int shift = 2;
		
		//store last two values in variables
		
		int temp1 = myArray[myArray.length-2];
		int temp2 = myArray[myArray.length-1];
		
	
		//shift values two positions to the right
		for (int i = myArray.length-1-shift; i>=0; i--) {
			myArray[i+shift] = myArray[i];
		}
		myArray[0] = temp1;
		myArray[1] = temp2;
		System.out.println(Arrays.toString(myArray));

	}
		
}


