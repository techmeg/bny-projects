package interfaceExercise;

public class AdultUser implements LibraryUser {

	public AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		System.out.println("Age: " + age);
		if (age>12) {
			System.out.println("You have successfully registered an Adult Account.");
		}else {
			System.out.println("Sorry, age must be greater than  12 to register as an Adult");
		}
	}

	@Override
	public void requestBook() {
		System.out.println("BookType: " + bookType);
		if(bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book in 7 days.");
		}else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	int age;
	String bookType;
}
