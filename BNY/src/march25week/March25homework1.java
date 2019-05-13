/**
 * 
 */
package march25week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class March25homework1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// take a string from the user and reverse it
		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}System.out.println(sb.toString());

	}

}
