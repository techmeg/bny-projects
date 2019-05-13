package NewJDBC;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImplementation extends AbstractDAO implements EmployeeDAO{
	
	Employee employee = new Employee();
	List<Employee> employees = new ArrayList<Employee>();

	public Employee getEmployeeByID(int id) {
	
	
	try {
		this.connect();
		statement = conn.prepareStatement(SQLQueries.GET_EMPLOYEE_BY_ID.getQuery());
		statement.setInt(1, id); 
		results = statement.executeQuery();
		
		if(results.next()) {
			employee.setUserID(results.getInt(1));
			employee.setfName(results.getString(2));
			employee.setlName(results.getString(3));
			employee.settel(results.getString(4));
			employees.add(employee);
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		this.dispose();
		return employee;} 
	}
	
	public List<Employee> getAllEmployees() {
		return employees;
	}
}
	

	


//for (Employee emp : employees) {
//	System.out.println("ID: " + emp.getUserID() + ", " + emp.getfName() + " " + emp.getlName() + ", " + emp.gettel());

