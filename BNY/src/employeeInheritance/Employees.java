package employeeInheritance;

public class Employees {

	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	//define and instantiate Constructor
	Employees (long id, String name, String address, long phone){
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	//method to calculate salary
	void calculateSalary(double basicSalary, double specialAllowance, double hra){
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		System.out.printf("The salary is: $%.2f\n" , salary);
	}
	//method to calculate Transportation Allowance
	void calculateTransportAllowance (double basicSalary) {
		double transportAllowance = .10*basicSalary;
		System.out.printf("The transport allowance is: $%.2f\n" , transportAllowance);
	}
}
