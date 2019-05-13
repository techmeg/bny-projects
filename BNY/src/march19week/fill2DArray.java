package march19week;

public class fill2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2D = new int [3][4];
		int rows = 3;
		int columns = 4;
		int mult10 = 10;
		
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<columns; j++) {
				array2D[i][j] = mult10;
				mult10 += 10;
				System.out.println(array2D[i][j]+" ");

				}System.out.println( "" );
			}
		//create and fill array with random elements
		int [][]random2D = new int [3][4];
		
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<columns; j++) {
				random2D[i][j] = (int)(Math.random()*10); 
				System.out.println(random2D[i][j]+" ");

				}System.out.println( "" );
			}
		
		
		}
	}


