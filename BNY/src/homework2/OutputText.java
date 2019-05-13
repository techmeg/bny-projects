/**
 * 
 */
package homework2;

/**
 * @author margaret.parsons
 *
 */
public class OutputText {

	/**
	 * try to make this work as a class to call from BasicJavaVaribles
	 */
	public static void main(String[] args) {
		//Output text from StringVariables
		// Declare variables
		String myName = "";
		String myHair = "";
		String myTeeth = "";
		String myEyes = "";
		int myAge = 0;
		int myHeight = 0;
		
		//Output text
		System.out.println("Let's talk about " + myName + ".");
		System.out.format("They're %d inches tall.%n", myHeight);
		System.out.format("They're %d years old.%n", myAge);
		System.out.println("Huh, that's older than I expected...");
		System.out.format("They have %s eyes and %s hair.%n", myEyes, myHair);
		System.out.format("Their teeth are usually %s, but it depends on the coffee.%n", myTeeth);
		System.out.format("Alright, this is pretty boring. Let's stop talking about %s.%n%n", myName);
		}
	
	}


