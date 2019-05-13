package oopsEX;

public class DoMyBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FeeCheckingAcct myCheck = new FeeCheckingAcct(1.2);
		myCheck.setMyBal(1500.67);
		System.out.println(myCheck.getMyBal());
		
		myCheck.withdraw(myCheck.getMyBal(), 100);
		System.out.println(myCheck.getMyBal());

		myCheck.withdraw(myCheck.getMyBal(), 115);
		System.out.println(myCheck.getMyBal());

		myCheck.chargeFee();
		System.out.println(myCheck.getMyBal());

		myCheck.applyInterest(myCheck.getMyBal(), myCheck.getMyInterest());
		System.out.println(myCheck.getMyInterest());
		System.out.println(myCheck.getMyBal());

		
		
	}

}
