package march25week;

import java.util.Arrays;

/*
*Insert a number into an array using binary search
*
**/
public class InserttoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {4, 5, 7, 8, 10};
		int newElement = 9;
		//get insertion point from search utility
		int insertIdx = java.util.Arrays.binarySearch(list, newElement);
		System.out.println(insertIdx);
		
		insertIdx = (insertIdx+1)*-1;
		System.out.println(insertIdx);
		
		//create larger array to hold added element
		int[]newList = new int[list.length+1];
		//duplicate original array
		for (int i = 0; i < list.length; i++) {
				newList[i] = list[i];
		}
		int shift = newList.length-insertIdx;
		int temp;
		
		//shift values to the right
		for (int i = newList.length-1; i>insertIdx; i--) {
			newList[i] = newList[i-1];
			System.out.println(Arrays.toString(newList));
		//insert new Element	
		}newList[insertIdx] = newElement;
		System.out.println(Arrays.toString(newList));
	}


}
