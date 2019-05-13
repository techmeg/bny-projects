/**
 * 
 */
package march19week;

/**
 * @author margaret.parsons
 * print out first 20 prime numbers
 */
public class primeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize variables
		
		int isPrime = 2;
		int divisor = 0;
		int count=0;
		
		
		System.out.println("The first 20 prime numbers are:");
		
		while (count<20) {
			//test for prime*/
			for (int i=2; i<=isPrime; i++ ) {
				if(isPrime%i==0) {
					
					divisor++;
				}
			}if(divisor==1) {
				count++;
				System.out.println(count + ": " +isPrime);

			}
			isPrime++;
			divisor=0;
		}
	}
	//not righht --fix later

}