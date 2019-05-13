/**
 * 
 */
package march25week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 * sort an array ascending using select sort logic
 */
public class SelectSortAlt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {3, 5, 0, -1, 4, 1, 1, 2};
		selectsort(nums);
		System.out.println(Arrays.toString(nums));
	
		
	}
	 static void  selectsort(int[]arr) {
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i<arr.length; i++) {
			int currentMin = arr[i];
			int minIndex = minFinder(i, arr);
			arr[minIndex]= arr[i];
			arr[i] = currentMin;
			

				System.out.print(i + "; ");
				System.out.println(Arrays.toString(arr));
			}

		}
	 
		
	static int minFinder(int startIndex, int[] num) {
		int min=num[startIndex];
		int minIndex = startIndex;
		
		for (int j = startIndex + 1; j<num.length; j++) {
			if (min > num[j]);
			min = num[j];
			minIndex = j;
		}return minIndex;

	}			
					
}//not working, why???
