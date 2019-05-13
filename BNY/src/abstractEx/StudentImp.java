package abstractEx;

public class StudentImp implements StudentI {

	String name;

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void introduceSelf() {
		// TODO Auto-generated method stub
		System.out.println("Hi, I'm " + name);
		System.out.println("I'm attending " + this.school);
	}

}
