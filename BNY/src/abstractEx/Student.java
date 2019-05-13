package abstractEx;

public class Student extends AbstractStudent {

	
	@Override
	void getInfo() {
		System.out.println("Hi. My name is " + this.firstName + " " + this.lastName);
		System.out.println("I have a " + this.gpa + " GPA.");
	}

	@Override
	String[] getName() {
		String[] name = {this.firstName, this.lastName};
		return name;
	}

	
}
