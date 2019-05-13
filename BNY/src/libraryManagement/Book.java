package libraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
	
	public Book(int bId, String bTitle, String bYearPubl) {
		super();
		this.bId = bId;
		this.bTitle = bTitle;
		this.bYearPubl = bYearPubl;
		this.bAuthor = bAuthor;
	}
	static int bId;
	static String bTitle;
	static Author bAuthor;
	static String bYearPubl;
	
	static List<Book> bookList = new ArrayList<Book>();
	int bookcount = 0;

	static void addBook(){ //TODO -- add try catch for input
		System.out.println("Enter the book title you would like to add to the library.");
		Scanner input = new Scanner(System.in);
		String tempTitle = input.nextLine();
		System.out.println("Enter the year of publication.");
		String year = input.next();
		//add book to bookList and print
		bId++;
		Book book = new Book(bId, tempTitle, year); //Shah -- how do I name new objects w/out hard coding?
		bookList.add(book);
		printBookList();
		
		if (book.bAuthor == null) {
			System.out.println("Author List is empty, please add an author");
			String authorName = input.next();
			book.bAuthor = authorName;
		}else {
			System.out.println("Is the author on the author list? Y/N");
			String yesNo = input.next();
			if(yesNo == "Y") {
				System.out.println("Enter Author ID.");
				int id = input.nextInt();
				
			}else {
				System.out.println("Enter the Author's name");
				String aName = input.next();
			}
		}
		}
		
		
		//if AuthorList is empty, ask for a new Author
		/*
		 * if(authorList.size() == 0) {//Shah -- how do I get authorList over here? //Do
		 * I have to make it a separate method under Author? String tempAuthor =
		 * input.nextLine(); }
		 */
		//add book id & title only
	
		//ask user for Author
	
		//add new Author to book
	
		//add existing Author to book
	
		//add book to book list, add book to Author book list
	}
	
	static void checkBookList() {
		if(bookList.size()==0) {
			System.out.println("Would you like to add a book? Y/N");
			Scanner input = new Scanner(System.in);
			String yesNo = input.next();
			switch(yesNo){
//				System.out.println("getting here?");
			case "N" : System.out.println("Bye! Come again soon.");
			break;
			case "Y" : 		
				addBook();
			}input.close();
		}
	}
	
	static void printBookList() {
		System.out.println("|| Book ID \t Title \t \t\t  Author\t ");
		System.out.println("-----------------------------------------------------");
		System.out.println("||    " + bId + ",     \t" + bTitle + ",\t  " + bAuthor);
		System.out.println("-----------------------------------------------------");
	}
}
