package march19week;

import java.util.Scanner;

public class fillArrayRandom {

	public static void main(String[] args) {
		// generate a random array with length specified by user
		
		int length;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements to hold in array");
		length=scan.nextInt();
		
		int arr[] = new int[length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
		//print array
		for(int i=0; i<arr.length; i++) {
			System.out.println("Number " + ": " + arr[i]);
			
		}

	}
}