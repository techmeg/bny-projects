package march25week;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStatic();
		
		Methods mc = new Methods();
		mc.testNotStatic();  
		//non-static class must be instantiated in order to use and it can't be used 
		//outside this class without instantiating again in the new class
		//both can be used inside the package; the static one can be used without
		//instantiating
		
		int mcAge = 16;
		String mcName = "John";
		static int mcID = 5;
		}
	public static void testStatic() {
		System.out.println("I am static");
	}
	
	public void testNotStatic() {
		System.out.println("I am not static");
		
	}

}
