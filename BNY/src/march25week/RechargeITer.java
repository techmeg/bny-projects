package march25week;
/*
 * 
 * Static polymorphism -- method overloading
 * 
 */
import java.util.Arrays;

public class RechargeITer {
	//all properties apply to students
	String name;//instructor
	String commitID;
	String email;//instructor
	String buddy;
	int javaKBAScore;
	String awsID;//instructor
	
	RechargeITer(String name, String commitID, int javaKBAScore){//student
	 this.name = name; //or name = name.ComingFromObject
	 this.commitID = commitID;
	 this.javaKBAScore = javaKBAScore;
	}
	RechargeITer(String name, String email, String awsID){//instructor
		 this.name = name; 
		 this.email = email;
		 this.awsID = awsID;
		}
	RechargeITer(){//acts like your default constructor which has been overwritten
		
	}
	int add (int x, int y) {
		return x+y;
	}
	int add (int x, int y, int z) {
		return x+y+z;
	}

	public static void printMe(RechargeITer obj) { //method to print object
		System.out.println(obj.name);
		System.out.println(obj.commitID);
		System.out.println(obj.email);
		System.out.println(obj.buddy);
		System.out.println(obj.javaKBAScore);
		System.out.println(obj.awsID);

	}
	public void printMe2() {  //non-static version; method of printing object 
		System.out.println("My name is " + name + ", my ID is " + commitID);
//		System.out.println(commitID);
//		System.out.println(email);
//		System.out.println(buddy);
//		System.out.println(javaKBAScore);
//		System.out.println(awsID);

	}
		
	//properties that are common to class but unique to members of the class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RechargeITer vernon = new RechargeITer("Vernon", "XXXX2", 100);

		vernon.buddy = "Marco";
		vernon.email = "vernon@bny";
		
		//	printMe(vernon);
//		vernon.printMe2();
		
		RechargeITer claire = new RechargeITer("Claire", "XXXX3", 100);
//		printMe(claire); //if invoked prior to reassigning name, prints Claire
		claire.name = "gail";
		claire.buddy = "Everyone";
		claire.email = "claire@bny";
		
//		claire.printMe2();; //invoked after; prints gail
		
		RechargeITer ins1 = new RechargeITer("Intructor1", "ins1@perscholas", "nnnn4");
		ins1.printMe2();
		
		RechargeITer [] pList = new RechargeITer[25];
		pList[0] = claire;
		pList[1] = claire;//you can put duplicates in the array
		pList[2] = vernon;
		
//		System.out.println(Arrays.toString(pList));//prints memory ref and nulls
		
		for(int i=0; i<3; i++) {
			pList[i].printMe2();
			System.out.println("My name is " + pList[i].name + " and ID " + pList[i].buddy);
		}
		
		//because methods are in same class they can be used by all the objects
		claire.add(1,2);
		ins1.add(2,3);
		
	}
}
