/**
 * 
 */
package homework2;

/**
 * @author margaret.parsons
 *
 */
public class BasicJavaVariables {

	/**
	 * create & replace variable and use in output
	 * Note: I was trying to figure out how to make the output a function/method/class or something
	 * so I can call it, but then sql happened and I had to move on :(
	 */

	public static void main(String[] args) {
		
		//declare variables
		String myName = "Shahparan";
		String myHair = "Black";
		String myTeeth = "White";
		String myEyes = "Black";
		int myAge = 31;
		int myHeight = 175;
		
		//Output 
		System.out.println("Let's talk about " + myName + ".");
		System.out.format("They're %d inches tall.%n", myHeight);
		System.out.format("They're %d years old.%n", myAge);
		System.out.println("Huh, that's older than I expected...");
		System.out.format("They have %s eyes and %s hair.%n", myEyes, myHair);
		System.out.format("Their teeth are usually %s, but it depends on the coffee.%n", myTeeth);
		System.out.format("Alright, this is pretty boring. Let's stop talking about %s.%n%n", myName);
		
		//create new variables
		String name = "Meg";
		String hair = "grey";
		String teeth = "white";
		String eyes = "blue";
		int age = 62;
		double height = ((5*12) + 8)*2.54;
		
		//replace variable values
		myHeight = (int)height;
		myAge = age;
		myEyes = eyes;
		myTeeth = teeth;
		myHair = hair;
		myName = name;
		
		//Output again
		System.out.println("Let's talk about " + myName + ".");
		System.out.format("They're %d inches tall.%n", myHeight);
		System.out.format("They're %d years old.%n", myAge);
		System.out.println("Huh, that's older than I expected...");
		System.out.format("They have %s eyes and %s hair.%n", myEyes, myHair);
		System.out.format("Their teeth are usually %s, but it depends on the coffee.%n", myTeeth);
		System.out.format("Alright, this is pretty boring. Let's stop talking about %s.", myName);
		
		
	}

}
