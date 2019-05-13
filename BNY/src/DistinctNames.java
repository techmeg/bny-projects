import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog1 = new Animal("Tom", 4);
		Animal dog2 = new Animal ("Biscuit" , 4);
		Animal dog3 = new Animal ("Cookies", 4);
		Animal dog4 = new Animal ("Cookies", 4);
		Animal dog5 = new Animal ("Biscuit", 4);
		
		List <Animal> dogs = new ArrayList<Animal>(Arrays.asList(dog1, dog2, dog3, dog4, dog5));
		
         
	        for(int i=0;i<dogs.size(); i++){
	            boolean isDistinct = false;
	            for(int j=0;j<i;j++){
	                if(dogs.get(i).name == dogs.get(j).name){
	                    isDistinct = true;
	                    break;
	                }
	            }
	            if(!isDistinct){
	                System.out.println(dogs.get(i).name);
	            }
	        }
	    }
	}
	
	


