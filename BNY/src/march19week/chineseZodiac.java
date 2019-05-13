/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 * discover which Chinese Zodiac sign matches your birth year
 */
public class chineseZodiac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ask user for their birth year
		int birthYear;
		int zodiac;
		
		System.out.println("Enter the year you were born, please.");
		Scanner input = new Scanner(System.in);
		birthYear = input.nextInt();
		
		zodiac = birthYear%12;
		
		switch (zodiac) {
		case 0: System.out.println("You were born in the year of the monkey.");
		break;
		case 1: System.out.println("You were born in the year of the rooster.");
		break;
		case 2: System.out.println("You were born in the year of the dog.");
		break;
		case 3: System.out.println("You were born in the year of the pig.");
		break;
		case 4: System.out.println("You were born in the year of the rat.");
		break;
		case 5: System.out.println("You were born in the year of the ox.");
		break;
		case 6: System.out.println("You were born in the year of the tiger.");
		break;
		case 7: System.out.println("You were born in the year of the rabbit.");
		break;
		case 8: System.out.println("You were born in the year of the dragon.");
		break;
		case 9: System.out.println("You were born in the year of the snake.");
		break;
		case 10: System.out.println("You were born in the year of the horse.");
		break;
		case 11: System.out.println("You were born in the year of the sheep.");
		break;
		
		
		}

		
	}

}
