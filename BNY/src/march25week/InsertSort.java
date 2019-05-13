/**
 * 
 */
package march25week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 * Method to Sort array by inserting into subarray
 */
public class InsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 5, 2, 7, 3, 6};
		
		
		for (int i = 1; i<list.length; i++) {
			int currentElement = list[i];
			for (int k =i-1; k>=0 && list[k]>currentElement; k--) {
				list[k+1] = list[k];
				list[k] = currentElement;
			}
		}System.out.println(Arrays.toString(list));
	}

}
