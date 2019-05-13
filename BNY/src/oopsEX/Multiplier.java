package oopsEX;

public class Multiplier extends Calculator{
	
	private final String MULTIPLY = "x";
	private final String DIVIDE = "/";
	
	public void multiply (int a, int b) {
		int result = a * b;
		display(a, b, MULTIPLY, result);
	}
	public void divide(int a, int b) {
		int result = a/b;
		display(a, b, DIVIDE, result);
	}

}
