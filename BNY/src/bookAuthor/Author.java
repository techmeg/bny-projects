package bookAuthor;

import java.util.ArrayList;
import java.util.List;

public class Author {
	
	int authorId;
	String authorName;
	List<Book> authorBooks;
	
	
	
	Author(int authorId, String authorName, List<Book>authorBooks){
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorBooks = authorBooks;
	}
	 void printAuthor() {
		 System.out.println("The author's information is: ");
		System.out.println("\t" + authorId);
		System.out.println("\t" + authorName);
		for (Book b: authorBooks) {
			System.out.println("\t" + b.bookTitle);
		}
	}

}
