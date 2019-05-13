package employeeInheritance;

public class Trainee extends Employees {

	Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}

}
