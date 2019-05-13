package monstersInheritance;

public class FireMonster extends Monster{

	public FireMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*	public FireMonster(String mName, int xyz) {
		super(mName);
		age = xyz; //if variable and parameter have different names, "this" is not needed
		//this refers to the object itself
		// TODO Auto-generated constructor stub
	}
	int age;*/

	
	
	public String attack() {
		return "Attack with Fire";
	}


}
