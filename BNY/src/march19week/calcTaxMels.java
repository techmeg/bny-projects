/**
 * 
 */
package march19week;

import java.util.Scanner;

/**
 * @author margaret.parsons
 * calculate tax based on filing status and income
 */
public class calcTaxMels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fileStatus = 0;
		double income = 0.0;
		double taxOwed=0.0;


	while (fileStatus<=0 || fileStatus>4) {
		System.out.println("Enter your filing status:");
		System.out.println("(1)Filing as Single");
		System.out.println("(2)Filing as Married Filing Jointly");
		System.out.println("(3)Filing as Married Filing Separately");
		System.out.println("(4)Filing as Head of Household");
		Scanner input = new Scanner(System.in);
		try {
			fileStatus = input.nextInt();
		}
		catch (Exception e) {
			System.out.println("***********Error, enter a number between 1 and 4 *******");
			input.nextLine(); // need this to reset Scanner token, otherwise infinite loop
			continue;
		}
	}
	while(income<=0) {	
		System.out.println("Enter your annual income, please");
		Scanner input = new Scanner(System.in);
		try {
		income = input.nextDouble();
		}catch (Exception e) {
			System.out.println("****** Error, income must be a positive number ********");
			input.nextLine(); // need this to reset Scanner token, otherwise infinite loop
			continue;
		}
	}

		//calculate taxes
		
		if (fileStatus == 1) {
			if (income>0 && income<=8350) {
				taxOwed = income*.1;
			}else if (income>8350 && income <=33950) {
				taxOwed = income * .15;
			}else if (income>33950 && income <=82250) {
				taxOwed = income * .25;
			}else if (income>82250 && income <=171550) {
				taxOwed = income * .28;
			}else if (income>171550 && income <=372950) {
				taxOwed = income * .33;
			}else if (income>372950) {
				taxOwed = income * .35;
			}
			
		}else if (fileStatus == 2) {
			if (income>0 && income<=16700) {
				taxOwed = income*.1;
			}else if (income>16700 && income <=67900) {
				taxOwed = income * .15;
			}else if (income>67900 && income <=137050) {
				taxOwed = income * .25;
			}else if (income>137050 && income <=208850) {
				taxOwed = income * .28;
			}else if (income>208850 && income <=372950) {
				taxOwed = income * .33;
			}else if (income>372950) {
				taxOwed = income * .35;
			}
			
		}else if (fileStatus == 3) {
			if (income>0 && income<=8350) {
				taxOwed = income*.1;
			}else if (income>8350 && income <=33950) {
				taxOwed = income * .15;
			}else if (income>33950 && income <=68525) {
				taxOwed = income * .25;
			}else if (income>68525 && income <=104425) {
				taxOwed = income * .28;
			}else if (income>104425 && income <=186475) {
				taxOwed = income * .33;
			}else if (income>186476) {
				taxOwed = income * .35;
			}
		
		}else if (fileStatus == 4) {
				if (income>0 && income<=11950) {
					taxOwed = income*.1;
				}else if (income>11950 && income <=45500) {
					taxOwed = income * .15;
				}else if (income>45500 && income <=117450) {
					taxOwed = income * .25;
				}else if (income>117450 && income <=190200) {
					taxOwed = income * .28;
				}else if (income>190200 && income <=372950) {
					taxOwed = income * .33;
				}else if (income>186476) {
					taxOwed = income * .35;
				}
		}
		System.out.printf("You owe $%,.2f in tax.", taxOwed);	
		
	}

}
