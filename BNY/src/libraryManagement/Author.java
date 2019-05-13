package libraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Author {

	public Author(int aId, String aName) {
		this.aId = aId;
		this.aName = aName;
		aBooks = new ArrayList<Book>();
	}
	
	int aId;
	String aName;
	ArrayList<Book> aBooks= new ArrayList<Book>();
	
	static List<Author> authorList = new ArrayList<Author>();
	
	static void  addAuthor() {
		Scanner input = new Scanner(System.in);
		if(authorList.size()==0) {
			System.out.println("Author List is empty, please add an author");
			String authorName = input.next();
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
}
