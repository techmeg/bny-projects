/**
 * 
 */
package march25week;

/**
 * @author margaret.parsons
 *
 */
public class FactorIterative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int factorial = 1;
		
		for(int i=num; i>=1; i--) {
			if (num==i) {
				factorial = num;
			}else {
				factorial = factorial * i;
				num--;
			}
			
		}System.out.println(factorial);
	}

}
