package libraryManagement;

import java.util.Scanner;

public class scratch {

	public static void main(String[] args) {
		
		int select=0;
		// TODO Auto-generated method stub
		System.out.println("What would you like to do? (Choose number)");
		System.out.println("1. Add a book?");
		System.out.println("2. Delete a book?");
		System.out.println("3. Update book info?");
		System.out.println("4. Exit System?");
		Scanner input = new Scanner(System.in);
		select = input.nextInt();

		switch(select) {
		case 4: System.out.println("Exiting program. Bye");
		break;
		case 1: System.out.println("one");
		break;
		case 2: System.out.println("two");
		break;
		case 3: System.out.println("three");
		break;
		default: System.out.println("Invalid Input, exiting program. Bye");
		break;
		}input.close();
	}

}
