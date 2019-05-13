/**
 * 
 */
package march25week;

/**
 * @author margaret.parsons
 *
 */
public class BinsearchRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Recursive Binary Search
		
		int[]arr = {2, 3, 4, 10, 40};
		int key = 4;
		int startIndex = 0;
		int endIndex = arr.length -1;
		
		int result = binarySearch(arr, key, startIndex, endIndex);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
		
		public static int binarySearch(int[]arr, int key, int startIndex, int endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			
			if (endIndex < startIndex) {
				return -1;
			}
			if (key < arr[midIndex]) {
				return binarySearch(arr, key, startIndex, midIndex-1);
			}
			if (key > arr[midIndex]) {
				return binarySearch(arr, key, midIndex+1, endIndex);
			}
			if (key == arr[midIndex]) {
				return midIndex;
			}
			return -1;
		}
			

	}


