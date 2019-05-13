package march25week;

import java.util.Arrays;

public class scrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][6];
		int[] x = {1,2};array[0] = x;
		System.out.println("array[0][1] is " + array[0][1]);
		System.out.println(Arrays.deepToString(array));
		
		int[][] arr = {{1,2}, {3,4}, {5,6}};
		for (int i = arr.length - 1; i >= 0; i--) 
		{for (int j = arr[i].length - 1; j >= 0; j--)
			System.out.print(arr[i][j] + " ");
		System.out.println();
		}
		int[][] array1 = {{1,2}, {3,4}, {5,6}};
		int sum = 0;
		for (int i = 0; i < array1.length; i++)
			sum += array1[i][0];
		System.out.println(sum);
	
	int [][]matrix = new int [10] [10];
	
	for (int row = 0; row < matrix.length; row++) {
		for (int column = 0; column < matrix[row].length; column++) {
		matrix[row][column] = (int)(Math.random() * 100);  }}
	System.out.println(Arrays.deepToString(matrix));

	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[i].length; j++) {
			int i1 = (int)(Math.random() * matrix.length);
			int j1 = (int)(Math.random() * matrix[i].length);
			int temp = matrix[i][j];
			matrix[i][j] = matrix[i1][j1];
			matrix[i1][j1] = temp;
		}
	}System.out.println(Arrays.deepToString(matrix));
	}
}


