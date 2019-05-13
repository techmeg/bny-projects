/**
 * 
 */
package march19week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 * generate array, sum, average and find numbers above the average
 */
public class aboveAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize vars for array size, average; declaring array
		
		int arrSize = 10;
		int arr[] = new int[arrSize];
		int sum = 0;
		int count = 0;
		
		//fill array with random numbers
		for(int i=0; i<arrSize; i++) {
			arr[i] = (int)(Math.random() * 100);
			//sum array, compute average
			sum += arr[i];
			}
		double avg = sum /arrSize;
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum is: " + sum + "; " + "Average = " + avg);
		
		//initialize counter, compare array elements to average

		for (int i=0; i<arr.length; i++) {
			 if(arr[i]>avg) {
				 count++;
			}
			//print result 
		}System.out.println("The number of elements greater than the average is: " + count);
	}

}
