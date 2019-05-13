/**
 * 
 */
package march19week;

/**
 * @author margaret.parsons
 * Find out how many years til tuition is doubled
 */
public class tuitionIncrease {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;
		double increase = .07;
		int year = 1;
		
		while (tuition<20000) {
			System.out.printf("Year %d tuition = %.0f\n", year, tuition);
			tuition = tuition * (1+increase);
			year++;

		}System.out.printf("Year %d tuition = %.0f\n", year, tuition);
		System.out.println("Tuition will be doubled by year " + year + ".");
	}

}
