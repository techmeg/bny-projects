package march25week;
/*
 * sort an array in descending order using bubble sort
 */
import java.util.Arrays;

public class BubbleSortDesc {

	public static void main(String[] args) {
 
		double [] list = {.3, 5.1, .24, 1.2};
		int swapCount = 1;
		
		while (swapCount >0) { //array is in order when no swaps occur
			swapCount = 0;

			for (int i=list.length-1; i>=1; i--) {
				if (list[i] > list[i-1]) {
					double temp = list[i];//swap positions
					list[i] = list[i-1];
					list[i-1]=temp;
					swapCount++; //increment counter to reinitiate loop
			
				}
			}
			
		}System.out.println(Arrays.toString(list));
	}

}
