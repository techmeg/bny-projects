package interfaceExercise;

public class KidUsers implements LibraryUser{

	public KidUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}	

	@Override
	public void registerAccount() {
		System.out.println("Age: " + age);
		if(age<=12) {
			System.out.println("You have successfully registered under a Kids Account");
		}else if (age>12){
			System.out.println("Sorry, your age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook() {
		System.out.println("BookType: " + bookType);
		if (bookType == "Kids") {
			System.out.println("Book issued successfully, please return the book within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only Kids books.");
		}
	}
	int age;
	String bookType;

}
