/**
 * 
 */
package april1Week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author margaret.parsons
 * slide 10 in Collections
 */
public class ListImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = Arrays.asList(3,4,6,7,9,12,15,17,23);
		List<Integer> b = Arrays.asList(3,5,7,9,10,13,15,18,23);
		List<Integer> c = new ArrayList<Integer>();
		int A_account = 0, B_account = 0;
		while(A_account != a.size() && B_account != b.size()) {
			if (a.get(A_account) < b.get(B_account)) {
				A_account ++;
			}else if (b.get(B_account) < a.get(A_account)) {
				B_account++;
			}else {
				c.add(a.get(A_account));
				A_account++;
				B_account++;
			}
		}
		System.out.println(c);
		
	}

}
