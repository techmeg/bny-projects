package interfaceActivity;
/*
 * 
 * Multiple Interfaces is a way to get around prohibition against multiple inheritance
 * Interfaces can extend each other
 * 
 */
public class ConcreteClass implements MyInterface, YourInterface{

	@Override
	public void sayHello() {
		System.out.println("hi");
		System.out.println("I am from " + MyInterface.companyName);
	}
	@Override
	public void shakeHand() {
		System.out.println("shake hands");
		
	}
	
	public static void main (String... args) {
		//two ways to instantiate concrete class
		ConcreteClass concrete1 = new ConcreteClass();
		
		MyInterface myInterf = new ConcreteClass();
		

		concrete1.sayHello();
		concrete1.shakeHand();
		concrete1.letsChat();
		
	}
	@Override
	public void letsChat() {
		System.out.println("let's chat");
	}



}