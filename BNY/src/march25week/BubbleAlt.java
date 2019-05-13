/**
 * 
 */
package march25week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 *
 */
public class BubbleAlt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5, 4, -1, 12, 0, 4, -3};
		
		for (int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr.length-j-1; j++) {
				if (arr[i]>arr[i+1]) {
					int temp = arr[i];  //swap positions
					arr[i] = arr[i+1];
					arr[i+1]=temp;
				}
			}
		}System.out.println(Arrays.toString(arr)); //not working yet
	}
}
