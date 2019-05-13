package march19week;

import java.util.Scanner;

public class fillArray {

	public static void main(String[] args) {
		// generate a user array of five with user input
		
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Enter a number");
			arr[i] = scan.nextInt();
			System.out.println(arr);//prints memory address of array!!
		}
		for (int i=0; i<5; i++) {
			System.out.println("Number " + (i+1) + ": " + arr[i]);
		}

	}
}