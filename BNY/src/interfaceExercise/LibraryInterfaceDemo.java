package interfaceExercise;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers max = new KidUsers(10, "Kids");
		KidUsers bob = new KidUsers(18, "Fiction");
		
		max.registerAccount();
		bob.registerAccount();
		
		max.requestBook();
		bob.requestBook();
		
		AdultUser sally = new AdultUser(5, "Kids");
		AdultUser jane = new AdultUser(23, "Fiction");
		
		sally.registerAccount();
		jane.registerAccount();
		
		sally.requestBook();
		jane.requestBook();
	}

}
