/**
 * 
 */
package week2day1;

/**
 * @author margaret.parsons
 *
 */
public class PracticeMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Practice Math functions
		
		/*double circumference = 2 * Math.PI * 5;//use PI constant to get circle with radius of 5
		System.out.println(circumference);
		
		double result = Math.sqrt(9);//squareroot method
		System.out.println(result);
		
		double res1 = Math.ceil(11.2);
		System.out.println(res1);
		
		double res2= Math.floor(11.2);
		System.out.println(res2);
		
		double res3 = Math.rint(11.2);
		double res4 = Math.rint(11.5);//nearest even integer
		double res5 = Math.rint(11.7);
		System.out.println(res3 + ", " + res4 + ", "+  res5);
		*/
		double res6 = Math.round(11.5);
		System.out.println(res6);
		
		int res6A = (int)(Math.round(11.5f));//hmmm, not returning an integer
		System.out.println(res6A);
		
		res6A = (int)(Math.floor(12.5 + .5));//and neither is this!!
		System.out.println(res6A);
		
		long res7 = (long)(Math.round(11.5d));//round a double to a long
		System.out.println(res7);
		
		res7 = (long)(Math.floor(11.5 + .5));//the long way
		System.out.println(res7);
		
		int res8 = Math.min(45, 8);//find the minimum integer
		System.out.println(res8);
		
		double res9 = Math.max(45, 8);//find the maximum double
		System.out.println(res9);
		
		double res10 = Math.abs(-45);//find the absolute value
		System.out.println(res10);
		
		int res11 = (int)(Math.random()*10);//generate random number between 0-9
		System.out.println(res11);
		
		int res12 = (int)(20 + Math.random()*18);//generate a random number between 20-37
		System.out.println(res12);


		
	}

}
