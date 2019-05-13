package march25week;

public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStatic(); //called from Methods without instantiating
		
		Methods2 mc2 = new Methods2();
		
		Methods mc = new Methods();
		
		mc.testNotStatic();  
		//non-static class must be instantiated in order to use and it can't be used 
		//outside this class without instantiating again in the new class
		//both can be used inside the package; the static one can be used without
		//instantiating

