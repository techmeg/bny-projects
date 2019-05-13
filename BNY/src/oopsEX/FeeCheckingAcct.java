package oopsEX;

public class FeeCheckingAcct extends CheckingAcct{

	public FeeCheckingAcct(double interest) {
		super(interest);
		// TODO Auto-generated constructor stub
	}

	private static final double FEE = 2.00;
	
	public void chargeFee() {
		withdraw(getMyBal(), FEE);
	}
}
