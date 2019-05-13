package march19week;

import java.util.Arrays;

/*
 * reverse the order of integers in an array
 * 
 */
public class reverseInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]list = {1, 2, 3};
		int temp;
		
		for (int i = 0, j=list.length-1; i<list.length/2; i++, j--) {
			temp = list[i];
			list[i]= list[j];
			list[j]= temp;
		}
		System.out.println("The reversed array is " + Arrays.toString(list));

	}


}


