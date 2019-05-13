package generic;

public class UseGeneric {

	public static void main(String[] args) {
		// use generic variable
		Box<Integer> intBox = new Box<Integer>();
		intBox.add(12);
		intBox.add(24);
		intBox.add(42);
		intBox.add(45);
		System.out.println(intBox.get());
		

	}

}
