package march19week;

import java.util.Arrays;

public class arrayReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]list1 = {1, 2, 3, 4, 5, 6};
		int[]list2 = reverse(list1);
		System.out.println("The reversed array is: " + Arrays.toString(list2));
	}
	
	public static int[] reverse (int[] list) {
		int[]result = new int[list.length];
		
		for (int i = 0, j = result.length-1; i < list.length; i++, j--) {
			result[j] = list[i];
		}return result;
	}

}//homework reverse orig array in place
