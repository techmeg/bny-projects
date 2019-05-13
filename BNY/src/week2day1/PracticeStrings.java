package week2day1;

import java.util.Scanner;

public class PracticeStrings {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		if (Character.isDigit('8')){
			System.out.println("This is a digit");
			}else {
				System.out.println("Not a digit");
			}

	}*/
		String s = "Bob is a boy ";
		s = "Bob is a boy ";
		
		String s1 = "living in NYC";
		String s2 = "Welcome";
		
		
		//print string length
		System.out.println(s1.length());
		
		//trim string
		System.out.println(s.trim());
		
		//concatenate string
		System.out.println(s.concat(s1));
		
		//find index string
		System.out.println(s.charAt(4));
		
		//change to upper case
		System.out.println(s1.toUpperCase());
		
		//change to lower case
		System.out.println(s.toLowerCase());
		
		//use literal string instead of variable
		System.out.println("Test".toLowerCase());
		
		System.out.println("Enter: ");
		Scanner input1 = new Scanner(System.in);
		
		String s3 = input1.next();
		String s4 = input1.nextLine();
		System.out.println(s3);
		
		System.out.println(s4);

		
	}
}
