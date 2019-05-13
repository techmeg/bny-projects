package employeeInheritance;

public class Manager extends Employees {

	//overloading Employee constructor to make Manager Constructor
	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone); //sending these to the Employees
		this.basicSalary = salary;
	}
	//overriding parent TransportAllowance
	void calculateTransportAllowance(double basicSalary) {
		double transportAllowance = .15*basicSalary;
		System.out.printf("The transport allowance is: $%.2f\n" , transportAllowance);
	}
}
