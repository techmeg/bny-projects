/**
 * 
 */
package animalInheritance;

/**
 * @author margaret.parsons
 *
 */
public class Dog extends Animal {
	String name;
	boolean isTrained;
	
	Dog(int numOfLegs, boolean isPet, String name, boolean isTrained) {
		super(numOfLegs, isPet);
		this.name = name;
		this.isTrained = isTrained;
		
	}
	void walk() {
		System.out.println("Dog-class: Dog can only walk forward");
	}
	//overriding the parent sound method
//	void sound() {
//		System.out.println("Dog-class: Since I am an animal, I can make sound. Dog barks!");
//	}

}


