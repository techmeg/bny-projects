package march25week;

public class stringRev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I love Java";
		System.out.println(str.contains("Java"));//renders boolean value
		System.out.println(str.equalsIgnoreCase("j"));//renders boolean value
		
		String str2 = "Reverse me";
		StringBuilder sb = new StringBuilder(str2);
		sb.reverse();
	//	sb.setCharAt(2, m); syntax??
		
		for (int i=str2.length()-1; i>=0; i--) {
			sb.append(str2.charAt(i));
		}System.out.println(sb.toString());
		
		//1. count number of each letter
		//2. reverse preserving word spacing ie Java Basics becomes scis aBavaJ; "Reverse me" solve with String Builder
		//3. look at words and say if they are pallindromes ("Madam" "Wow" "Cat" "Dog")
		//for all take a string from the keyboard
		
		for(int i = 0; i <str.length(); i ++) {
			char c = str.charAt(i);
//			str.charAt(str.length()-1-i)= str.charAt(i); //does not work because both are values and left side must be a variable
		}
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);
		
		s1 = s1 + " is fun";
		System.out.println(s1 == "Java is fun");
		System.out.println(s1.contentEquals("Java is fun"));
		

	}
}
