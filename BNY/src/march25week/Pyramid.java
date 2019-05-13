/**
 * 
 */
package march25week;

/**
 * @author margaret.parsons
 *
 */
public class Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		
		for (int i = 0; i<numRows; i++) {
			
			for (int j = 0; j<numRows-i ; j++) {
			System.out.print("$");
			}
			for (int k = 0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
