/**
 * 
 */
package animalInheritance;

/**
 * @author margaret.parsons
 *
 */
public class Animal {

	/**
	 * @param args
	 */
	int numOfLegs;
	boolean isPet;
	
	Animal(int numOfLegs, boolean isPet){
		this.numOfLegs = numOfLegs;
		this.isPet = isPet;
	}
	//private makes this unavailable outside of Animal
	private static void sound(){
		System.out.println("Super: Since I am an animal, I can make sound");
	}
	//this makes sound method available to other classes
	void getSound() {
		sound();
	}
	void gotLife() {
		System.out.println("Super: Since I am an animal, I live!");
	}

}
