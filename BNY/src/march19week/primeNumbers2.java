/**
 * 
 */
package march19week;

/**
 * @author margaret.parsons
 * print out first 20 prime numbers
 */
public class primeNumbers2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize variables
		
		int isPrime = 2;
		boolean check = true;
		//can't test 2, so print it out first and move to next number
		System.out.println(isPrime + " is a prime number.");
		isPrime++;
		//check for the first 20 primes
		for (int count=2; count<=20; ) {
			//test for prime
			for (int j=2; j<isPrime/2; j++ ) {
				if(isPrime%j==0) {
					check=false;
					//if test fails break
					break;
				}
			}if (check) {
				//if prime true, print and increment counter and number to check
				System.out.println(isPrime + " is a prime number.");
				count++;
			}check=true;
			isPrime++;
		}
	}

}//makes 4 a prime number -- need to find logic error