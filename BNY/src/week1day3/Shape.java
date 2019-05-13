/**
 * 
 */
package week1day3;

import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class Shape {

	double radius;
	double width;
	double length;

	public Shape (double radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		// make a circle
		System.out.print("What is the radius of the circle? ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		input.close();
		
		Shape circle = new Shape(radius);
		//calculate the area of the circle 
		double area = circle.radius*circle.radius*3.14159;
		
		
		System.out.println("The area of the circle is " + area + ".");

		}
}