package oopsEX;

public class CheckingAcct extends BankAcct {

	private double myInterest;
	public CheckingAcct (double interest) {
		this.myInterest = interest;
	}

	
	/**
	 * @return the myInterest
	 */
	public double getMyInterest() {
		return myInterest;
	}
	/**
	 * @param myInterest the myInterest to set
	 */
	public void setMyInterest(double myInterest) {
		this.myInterest = myInterest;
	}
	public void applyInterest(double myBal, double intrate) {
		System.out.println("balance before interest " + myBal);
		myBal = (myBal * intrate);
		System.out.println("new balance " + myBal);
	}
	public void withdraw (double myBal, double amount) {
		myBal -= amount;
		System.out.println("balance: " + myBal);
	}
}
