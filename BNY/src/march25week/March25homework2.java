/**
 * 
 */
package march25week;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class March25homework2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO count # of each letter in a string
		
/*		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();*/
		
		String s="footstool";
		int count = 0;
		char[] chars = s.toCharArray();
		
		System.out.println(Arrays.toString(chars));
		for (int i = 0; i<s.length(); i++) {
			for (int j = 0; j<s.length(); j++) {
				if (s.charAt(i)== chars[j]) {
				count++;
				}
			}System.out.println("Number of " + s.charAt(i) + ": " + count);
			count = 0;
			
		}
	}
}
		
		
