import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog1 = new Animal("Fido", 4);
		Animal dog2 = new Animal ("Butch" , 4);
		Animal dog3 = new Animal ("Cookies", 4);
		Animal dog4 = new Animal ("Cookies", 4);
		
//		Animal[]shahsPet = {dog2, dog3};
		
		/*
		 * List<Animal> shahsPets = new ArrayList<Animal>(); shahsPets.add(dog2);
		 * shahsPets.add(dog3);
		 */
		
		List <Animal> shahsPet = new ArrayList<Animal>(Arrays.asList(dog2, dog3, dog4));
		
		for (Animal animal: shahsPet) {
			System.out.println(animal.name);
			
		String animalName = "Cookies";
		
//		Animal animal1 = null;
		
		ArrayList<Animal> aList = new ArrayList<>();
				
		for(int i=0; i<shahsPet.size(); i++) {
			if (!shahsPet.get(i).name.equals(animalName)) {
				continue;
			}else {
				aList.add(shahsPet.get(i))
				System.out.println("Dog found with name " + shahsPet.get(i).name);
			}
			}
		}System.out.println("No of dogs found with name " + animalName + " is " + aList.size());
	}

}
