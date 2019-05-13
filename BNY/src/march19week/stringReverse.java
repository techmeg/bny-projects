package march19week;

import java.util.Arrays;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myText = "I see i and j in my dream";
		char[] chars = myText.toCharArray();
		char[] revchars = new char[chars.length];
		
		System.out.println(Arrays.toString(chars));
		System.out.println(chars.length);
		
		for (int i=0, j=chars.length-1; i<chars.length; i++, j--) {
		revchars[i] = chars[j];
		myText = revchars.toString();
		
		}
		System.out.println(revchars);
		
	}

}
