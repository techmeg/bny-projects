package march25week;
/*
 * sort an array in ascending order using bubble sort
 */
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int [] list = {5, 4, -1, 12, 0, 4, -3};
		int swapCount = 1;
		
		while (swapCount >0) { //if no swap needed, array is sorted
			swapCount = 0;

			for (int i=0; i<list.length-1; i++) {
				if (list[i] > list[i+1]) {
					int temp = list[i];  //swap positions
					list[i] = list[i+1];
					list[i+1]=temp;
					swapCount++;  //increment count to reinitiate loop
			
				}
			}
			
		}System.out.println(Arrays.toString(list));
	}

}
