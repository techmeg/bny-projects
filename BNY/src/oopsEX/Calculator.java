package oopsEX;

public class Calculator {

	protected final String ADD = "+";
	private final String SUBTRACT = "-";
	
	public void display(int a, int b, String modifier, int c) {
		//Ex: 3 + 4 = 7
		System.out.println(a + modifier + b + "=" + c);
	}
	public void add(int a, int b) {
		int result = a + b;
		display(a, b, ADD, result);
		
	}
	public void subtract(int a, int b) {
		int result = a-b;
		display(a, b, SUBTRACT, result);
	}
	
}
