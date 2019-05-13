/**
 * 
 */
package animalInheritance;

/**
 * @author margaret.parsons
 *
 */
public class AnimalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal(4, false);
		System.out.println("a1:");
		a1.getSound();
		a1.gotLife();
		
		Dog dog1 = new Dog(4, true, "Biscuit", false);
		System.out.println("Dog:");
		dog1.gotLife();
		dog1.getSound();
		dog1.walk();
		
	// dog2 = new Animal() -- compile error -- can't create a parent(animal) from a child (Dog)
		Cat cat1 = new Cat(4, true, true);
		System.out.println("Cat:");
		cat1.catchMouse();
		cat1.gotLife();
		cat1.getSound();
	}

}
