package april1Week;

import java.util.Arrays;

public class scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = {'a', 'b', 'c'};
		System.out.println(array);
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr);
		
		int [] arr1 = {0, 0, 0, 0, 0};
		
		System.arraycopy(arr, 1, arr1, 0, 1);
		System.out.println(Arrays.toString(arr1));

	}
}
