package Services;

import jpqlTestEntities.Employee;

public interface EmployeeDAO {

	void getAllEmployees();
	void getEmployee();
	void getNamedQEmployee();
	void createEmployee(Employee emp);
	
	void removeEmployee(int id);
	Employee findEmployee(int id);
	void updateEmployeeTel(int id, String tel);
}
