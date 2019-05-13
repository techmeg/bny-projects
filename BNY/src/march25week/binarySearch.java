/**
 * 
 */
package march25week;

/**
 * @author margaret.parsons
 * binary search
 */
public class binarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {2, 3, 4, 10, 40};
		int key = 4;
		int idx = binarySearch(arr, key);
		if (idx == -1) {
			System.out.println("Element not present");
		}else {
			System.out.println("element can be found at " + idx);
		}
	}		
	public static int binarySearch(int[]arr, int key) {

		int low = 0;
		int high = arr.length-1;
		
		int mid = (arr.length-1)/2;
		
		while (low<=high) {
			if (arr[mid] == key) {
				return mid;
			}else if (arr[mid] < key) {
				low = mid+1;
				mid = (low + high)/2;
			
			}else if (arr[mid] > key) {
				high = mid-1;
				mid = (low + high)/2;
			}
		}return -1;
		

	}
}
				
				
				

