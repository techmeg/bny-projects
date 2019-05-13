/**
 * 
 */
package bookAuthor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author margaret.parsons
 *
 */
public class Bookstore2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book(1, "Have His Carcass", 111);
		Book b2 = new Book(2, "Gaudy Night", 222);
		Book b3 = new Book(3, "Strong Poison", 333);
		Book b4 = new Book (4, "The Prisoner of Azkaban", 444);
		Book b5 = new Book (5, "The Half-Blood Prince", 555);
		
		List<Book>allBooks = new ArrayList();
		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
		allBooks.add(b4);
		allBooks.add(b5);
	
		
		List<Book> sayers = new ArrayList();
		sayers.add(b1);
		sayers.add(b2);
		sayers.add(b3);
		
		List<Book> rowling = new ArrayList();
		rowling.add(b4);
		rowling.add(b5);
		
//		System.out.println(sayers.contains(b1));
		
		Author a1 = new Author (1, "Dorothy Sayers", sayers);
		Author a2 = new Author (2, "J.K. Rowling", rowling);
//		a1.printAuthor();
		
		List<Author> allAuthors = new ArrayList<Author>(); 
		allAuthors.add(a1);
		allAuthors.add(a2);

		//get user input of author to find
		boolean foundAuthor=true;
		
		while (foundAuthor) { //loop until an acceptable author is input
			System.out.println("What author are you looking for?");
			Scanner input = new Scanner(System.in);
			String whichAuthor = input.nextLine();
		//assign input to a variable for search	
			for (int i = 0; i<allAuthors.size(); i++) {
				//if author found, print info and break out of loop
				if (allAuthors.get(i).authorName.equals(whichAuthor)) {
					foundAuthor=false;
					allAuthors.get(i).printAuthor();
				//	System.out.println(foundAuthor);
					break;
	
				}else { 
					continue;
				}
			
			}if (foundAuthor) {//if author not found, try again
				System.out.println("Invalid, choose another author.");
			}
		}//get user input on what book to delete
		System.out.println("What book should be deleted?");
		Scanner input = new Scanner(System.in);
		String bookToGo = input.nextLine();
		
		boolean deleted = false;
		int delBookId = 1;
		
		for(int i=0; i<allBooks.size(); i++) {
			if (allBooks.get(i).bookTitle.equals(bookToGo)) {
				delBookId=i+1;
				allBooks.remove(allBooks.get(i));
				deleted=true;

			}
		}if (deleted) {
			System.out.println(bookToGo + " has been deleted.");
		}else {
			System.out.println(bookToGo + " is not on the book list.");
		}
		
	//	a1.printAuthor(); -- not taking book out of author -- only booklist
		System.out.println("After book deleted from AllBooks: ");

		for (Book b: allBooks) {
			System.out.println(b.bookTitle);
		}
	}
}
		
	


