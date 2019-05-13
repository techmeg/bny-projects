package march25week;

public class stringRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Java";
		a = a + "Basics";

		System.out.println("Before method: " +a);
		changeA(a); //Inside...
		System.out.println("After method: " +a);

		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2); // true
		
		s1 = s1 + " is fun";
		System.out.println(s1 == "Java is fun"); // false; s1 is a reference
		System.out.println(s1.contentEquals("Java is fun")); //true
		
		int n1 = 5; 
		int n2 = 5;
		System.out.println(n1 == n2);//true
		
		n1 = n1 + 5;
		System.out.println(n1 == 10);//true
		
		Integer num1 = 5; 
		Integer num2 = 5;
		System.out.println(num1 == num2);//true
		
		num1 = num1 + 5;
		System.out.println(num1 == 10);
		System.out.println(num1 == new Integer (10));//false, because num1 is a reference, not a value
	}
	static String changeA(String a) {
		a = a + "Advanced";
		System.out.println("Inside method: " +a);
		return a;

	}
		

		
}

