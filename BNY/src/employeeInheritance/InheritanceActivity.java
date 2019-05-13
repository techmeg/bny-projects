/**
 * 
 */
package employeeInheritance;

/**
 * @author margaret.parsons
 *
 */
public class InheritanceActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Manager Info:");
			//instantiating new Manager
			Manager m1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000.00);
			//invoking salary and transportation allowance
			m1.calculateSalary(65000., 250.80, 1000.50);
			m1.calculateTransportAllowance(65000.);

			System.out.println("Trainee Info:");
			//instantiating new Trainee
			Trainee t1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000.00);
			//invoking new Trainee
			t1.calculateSalary(45000,  250.80,  1000.50);
			t1.calculateTransportAllowance(45000);
			
	}

}
