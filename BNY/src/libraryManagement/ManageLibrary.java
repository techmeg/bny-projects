/**
 * 
 */
package libraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author margaret.parsons
 * program that allows user to add, delete and update books from a library
 */
public class ManageLibrary {

	 
	public static void main(String[] args) {
	//	open Scanner and initialize select
		Scanner input = new Scanner(System.in);
		int select=0;//variable for selecting a function
		
		//Welcome to library
		System.out.println("Welcome to the Library! What would you like to do?");
		
		//check if books in the library, if none, add is the only choice
		Book.checkBookList();

		//ask user for input on what they would like to do
	
		System.out.println("What would you like to do? (Choose number)");
		System.out.println("1. Add a book?");
		System.out.println("2. Delete a book?");
		System.out.println("3. Update book info?");
		System.out.println("4. Exit System?");
//		Scanner input = new Scanner(System.in);
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
		

		
		
		//delete book
		
			//ask user for book title
		
			//find it in the book list, get and store author
		
			//remove book from book list and author list
		
		//update book title info
		
			//ask user for title to update
		
			//find book and identify author
		
			//update book in book list and author list
		
		//update author info
		
			//ask user for title to update
		
			//find author and update info
		
		//if no action, exit
	


