package oopsEX;

public class RunCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiplier mult = new Multiplier();
		mult.add(1, 2);
		mult.subtract(5, 2);
		mult.multiply(4, 2);
		
		mult.divide(9, 3);
		Calculator calc = new Multiplier();
		calc.add(1, 2);
		calc.subtract(4, 2);
		
		Multiplier multi = new Multiplier();
		NewMultiplier newMulti = new NewMultiplier();
		
		multi.multiply(4, 5);
		newMulti.multiply(4,  5);
		newMulti.add(3,  4);
		multi.subtract(4, 2);
	}

}
