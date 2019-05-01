package zoo;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1 = new Animal(12, "M", 23, true);
		animal1.eats();
		
		Bird bird1 = new Bird(5, "F", 10, true);
		bird1.hunts();
		
		bird1.eats();
		bird1.flys();
	}

}
