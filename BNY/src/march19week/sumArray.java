package march19week;

import java.util.Arrays;

public class sumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1, 2, 3, 4, 5};
		
		double total = 0;
		
		for (int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println("The total is: " + total);
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)total - arr[i];
					
		}System.out.println(Arrays.toString(arr));
	}
	

}
