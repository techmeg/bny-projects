package oopsEX;

public class MainStaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person adam = new Person();
		Person eve = new Person();
		
		adam.setA("changed");
		adam.setB("changed");
		
		System.out.println("Adam A: " + adam.getA());
		System.out.println("Eve A: " + eve.getA());
		System.out.println();
		System.out.println("Adam B: " + adam.getB());
		System.out.println("Eve B: " + eve.getB());
		System.out.println("Adam getThisA " + adam.getThisA());
		
	}

}
