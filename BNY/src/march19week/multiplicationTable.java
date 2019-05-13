/**
 * 
 */
package march19week;

/**
 * @author margaret.parsons
 *
 */
public class multiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
			System.out.println("This is the multiplication table for " + i);
			for (int j=1; j<=10; j++) {
				
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("=========================================");
		}
	}

}
