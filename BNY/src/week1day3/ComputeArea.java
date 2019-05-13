/**
 * 
 */
package week1day3;
import java.util.Scanner;
/**
 * @author margaret.parsons
 *
 *for computing the area of shapes
 */
public class ComputeArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Compute the area of a circle

		
		double radius;
		double area;

		//get radius from the user
		
		System.out.println("Please enter the radius: ");
		
		//getting user input
		
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
	
		area=radius*radius*3.14159;
		
		System.out.println("The area of a circle with the radius of " + radius + " is " + area + ".");
		
		//Compute the area of a rectangle
		
		double width;
		double height;

		double areaRect;
		
		width=15.7;
		height=10;
		
		areaRect=width*height;
		
		System.out.println("The area of a rectangle with a width of " + width + " and height of " + height + " is " + areaRect + ".");
		

	}

}
