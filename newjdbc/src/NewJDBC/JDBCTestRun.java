/**
 * 
 */
package NewJDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @author margaret.parsons
 *
 */
public class JDBCTestRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO employeeDAO = new EmployeeDAOImplementation();
		
		
		System.out.println("What would you like to do? Enter 1 or 2.");
		System.out.println("1. Get one employees information.");
		System.out.println("2. Get all empoloyees information.");
		
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
		switch (select) {
		
		case 1: System.out.println("Enter employee ID#");
				int id = input.nextInt();
				System.out.println("Employee Info: for employee with id " + employeeDAO.getEmployeeByID(id).getUserID());
				System.out.println(employeeDAO.getEmployeeByID(id).getfName() + " " + employeeDAO.getEmployeeByID(id).getlName() + ", " + employeeDAO.getEmployeeByID(id).gettel());
				
//				Employee foundEmpl = employeeDAO.getEmployeeByID(id);
//				System.out.println("Employee Info:  " + foundEmpl.getUserID() + ": " + foundEmpl.getfName() + " " + foundEmpl.getlName() + ", " + foundEmpl.gettel());
		break;
		
		case 2: System.out.println("get here?");
				List<Employee> employees = new ArrayList<Employee>();
				employees = employeeDAO.getAllEmployees();
				for (Employee e : employees) {
					System.out.println("ID: " + e.getUserID() + ", " + e.getfName() + " " + e.getlName() + ", " + e.gettel());
				}

		break;
		}input.close();
		
		
	}

}
