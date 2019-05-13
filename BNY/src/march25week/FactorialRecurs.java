package march25week;

public class FactorialRecurs {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double factorial = 46;

		System.out.println(factorial(factorial));
	}
	static double factorial (double num) {
		if (num == 0) {
			return 1; //stops the recursion and multiplies by 1
		}else {
			return (num *(factorial(num-1)));

		}
	}
}

