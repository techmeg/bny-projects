package TestMain;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Services.EmployeeDAO;
import Services.EmployeeServices;
import jpqlTestEntities.Employee;

/**
 * 
 */

/**
 * @author margaret.parsons
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// using JPQL language to print all Employees from table
		
		
		EmployeeDAO empl = new EmployeeServices();
		
		empl.getAllEmployees();
		
		empl.getEmployee();
		
		empl.getNamedQEmployee();
		
		

	}

}
