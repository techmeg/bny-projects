package JUnitTest1;

public class Calculator {

	protected final String ADD = "+";
	private final String SUBTRACT = "-";
	private final String MULTIPLY = "x";
	private final String DIVIDE = "/";
	
	public void display(int a, int b, String modifier, int c) {
		//Ex: 3 + 4 = 7
		System.out.println(a + modifier + b + "=" + c);
	}
	public int add(int a, int b) {
		int result = a + b;
		display(a, b, ADD, result);
		return result;
		
	}
	public int subtract(int a, int b) {
		int result = a-b;
		display(a, b, SUBTRACT, result);
		return result;
	}
	
	public int multiply (int a, int b) {
		int result = a * b;
		display(a, b, MULTIPLY, result);
		return result;
	}
	public double divide(int a, int b) {
		double result = (double) a/b;
//		display(a, b, DIVIDE, result);
		System.out.println(result);
		return result;
	}

}
