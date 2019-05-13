package march19week;

import java.util.Arrays;

public class printArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		//print array using enhanced loop
		System.out.print("print array using enhanced loop -- in asc order");
		for (int element: arr) {
			System.out.println(element);
		}
		
		//print array using reg loop
		System.out.println("print array using loop -- desc");
		for (int i =arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		//print using standard library Arrays
		System.out.println("print as string array");
		System.out.println(Arrays.toString(arr));
	}

}
