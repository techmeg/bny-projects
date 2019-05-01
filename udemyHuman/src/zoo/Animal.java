package zoo;

public class Animal {

	
	int age;
	String gender;
	int weight;
	boolean hunts;
	
	public void eats() {
		System.out.println("eating..");
	}
	public void sleeps() {
		System.out.println("I sleep.. ");
	}
	public Animal(int age, String gender, int weight, boolean hunts) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.hunts = hunts;
	}
	public void hunts() {
		if (hunts) {
			System.out.println("I hunt. ");
		}else {
			System.out.println("I do not hunt.");
		}

	}
}
