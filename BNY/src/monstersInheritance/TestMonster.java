package monstersInheritance;

public class TestMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster m1 = new FireMonster("r2u2");//upcasting does not need (cast)
		FireMonster f1 = new FireMonster("fiery");

		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");

		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		
		m1 = new StoneMonster("a2b2");
		
		Monster m4 = new Monster("u2u2");
		
		System.out.println(m1.attack());
		System.out.println(m4.attack());
		
//		f1 = m1 //not possible without downcasting
		f1 = (FireMonster) m1; //the way to assign a monster to a FireMonster var is to cast it
		m1 = f1;//upcasting is OK
	}
	
}
