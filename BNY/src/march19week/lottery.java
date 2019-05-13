/**
 * 
 */
package march19week;
import java.util.Random;
import java.util.Scanner;
/**
 * @author margaret.parsons
 *
 */
public class lottery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initiate variables
		
		int guess = 0;
		int guess2nd = 0;
		int guess1st = 0;
		
		int lotteryNum = 0;
		int lotteryNum2nd = 0;
		int lotteryNum1st = 0;
	//generate a random number between 10-99
		Random rand = new Random();
		lotteryNum = rand.nextInt(89)+10;

	//	lotteryNum = (int)(Math.random()*90)+10;
		
		
		Scanner input = new Scanner (System.in);
		
	//condition acceptance of guess on range and catch negative and strings as exceptions	
		while ((guess<10) || (guess>99)) {
			System.out.println("Enter a two-digit number");
		try {
			guess = input.nextInt();	
		}catch (Exception e) {
			System.out.println("Invalid input. Enter an integer less than 100");
			input.nextLine();
			continue;
		}
		}
		//break two digit numbers into single digits for comparison
		guess2nd = guess % 10;
		guess1st = guess / 10;
		
		lotteryNum2nd = lotteryNum % 10;
		lotteryNum1st = lotteryNum / 10;
		
       //print both numbers to keep yourself honest
		System.out.println("Lottery number is " + lotteryNum + ", your guess is: " + guess + ".");
		//compare numbers
		if (guess==lotteryNum) {
			System.out.println("You are a $10,000 winner!! Woo hoo!");
		}else if ((guess2nd==lotteryNum1st) && (guess1st == lotteryNum2nd)) {
			System.out.println("You are a $3000 winner!!");
		}else if ((guess1st==lotteryNum1st || guess1st==lotteryNum2nd || guess2nd==lotteryNum1st || guess2nd==lotteryNum2nd)) {
			System.out.println("You are a $1000 winner!!");
		}else {
			System.out.println("You did not win today.");
		}
		
	}

}
