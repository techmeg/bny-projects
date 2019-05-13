package TestThis;

public class TTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThis tt = new TestThis();
		tt.addName("Jared");
		
		System.out.println(tt.getNameAtIndex(2));
		
//		System.out.println(tt.getNames().get(tt.getNames().size()-1));
		
		System.out.println(tt.getNames().toString());
			
		}


}
