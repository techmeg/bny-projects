/**
 * 
 */
package march25week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 * sort an array ascending using select sort logic
 */
public class SelectSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {3, 5, 0, -1, 4, 1, 1, 2};
		selectsort(nums);
		System.out.println(Arrays.toString(nums));
	
		
	}
	public static void  selectsort(int[]arr) {
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i<arr.length; i++) {
			int currentMin = arr[i];
			int currentIndex = i;
			for (int j = 1+i; j<arr.length; j++) {
				if (arr[j]<currentMin) {
					currentMin = arr[j];
					currentIndex = j;
					
				}
			}
			if (currentIndex != i) {
				arr[currentIndex]= arr[i];
				arr[i] = currentMin;
				System.out.print(i + "; ");
				System.out.println(Arrays.toString(arr));
			}
			
		}
		
	}
}
