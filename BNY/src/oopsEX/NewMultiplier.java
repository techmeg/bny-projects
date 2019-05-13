package oopsEX;

public class NewMultiplier extends Multiplier{

	//overrides display
	public void display (int a, int b, String modifier, int result) {
		System.out.println(a + modifier + b + "yields " + result);
	}
	//overrides Calc adding function
	public void add(int a, int b) {
		int result = a + a + b;
		display (a, b, ADD, result);
	}
}
