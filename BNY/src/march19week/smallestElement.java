/**
 * 
 */
package march19week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 *
 */
public class smallestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 1, -5, 4, -3};
		
		double min = arr[0];
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i]< min) {
				min = arr[i];

			}
		}System.out.println(Arrays.toString(arr));

		System.out.println("The smallest element is: " + min);
		
	}

}
