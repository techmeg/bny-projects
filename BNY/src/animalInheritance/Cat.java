package animalInheritance;

public class Cat extends Animal{




		boolean canClimb;
		
		Cat(int numOfLegs, boolean isPet, boolean canClimb) {
		super(numOfLegs, isPet);
		this.canClimb = canClimb;
		
		}
//		void sound() {
//			System.out.println("Cat-class: Since I am an animal, I can make sound. Cat meows!");
//
//		}
		void catchMouse() {
			System.out.println("Cat-class: Sinces I am a cat, I catch mice.");
		}

}
