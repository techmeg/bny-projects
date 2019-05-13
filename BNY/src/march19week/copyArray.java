package march19week;

import java.util.Arrays;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray = {1, 2, 3, 4};
		int[] targetArray = {5, 6, 7, 8};
		
		System.out.println(Arrays.toString(sourceArray));
		System.out.println(Arrays.toString(targetArray));
		
		targetArray = sourceArray;
		System.out.println(Arrays.toString(sourceArray));
		System.out.println(Arrays.toString(targetArray));
		
		targetArray[0] = 12;
		System.out.println(Arrays.toString(sourceArray));
		System.out.println(Arrays.toString(targetArray));

		//DANGER!! If you want to retain sourceArray
		
		int[] sourceArray2 = {1, 2, 3, 4};
		int[] targetArray2 = new int[sourceArray2.length];
		
		for (int i = 0; i < sourceArray2.length; i++) {
			targetArray2[i] = sourceArray2[i];
		}
		System.out.println(Arrays.toString(sourceArray2));
		System.out.println(Arrays.toString(targetArray2));
		
		
	}

}
