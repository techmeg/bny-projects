/**
 * 
 */
package com.jpaTest.main;


import com.jpaTest.entities.User;


import com.jpaTest.services.UserDAO;
import com.jpaTest.services.UserServices;

/**
 * @author margaret.parsons
 *
 */
public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instantiating test ID, and two classes
		/*
		 * int id = 28;
		 * 
		 * EmployeeDAO employee = new EmployeeServices(); Employee emp = new Employee();
		 * 
		 * //create new employee emp.settel("212-496-7921"); emp.setfName("Max");
		 * emp.setlName("Parsons"); emp.setUserID(28);
		 * 
		 * 
		 * //call remove method employee.removeEmployee(id);
		 * System.out.println("user removed");
		 * 
		 * //call create method & print result employee.createEmployee(emp);
		 * System.out.println("Employee Created"); emp.printEmployee(emp);
		 * 
		 * //set new tel number and call update method String tel = "333-333-3335";
		 * employee.updateEmployeeTel(id, tel); System.out.println("Employee Updated");
		 * employee.findEmployee(id).printEmployee();
		 * 
		 * 
		 * //call find employee method employee.findEmployee(5);
		 * System.out.println("Employee Found");
		 * employee.findEmployee(id).printEmployee();;
		 * 
		 */		/*
		 * if(emp != null) { employee.findEmployee(id).printEmployee();
		 * System.out.println(emp.toString()); }else {
		 * System.out.println("Error: employee not found"); }
		 */
		  
		//instantiate User & ID variable for other tests
		  UserDAO user = new UserServices();
		  User newuser = new User();
		  
		  newuser.setUserID(12);
		  newuser.setFirstName("Bob");
		  newuser.setLastName("Jones");
		  newuser.setCity("Gary");
		 
		  int uid = 3;
		  
		
		/*
		 * //call remove user method -- does not work because it's violating some
		 * foreign key constraint user.removeUser(uid);
		 * System.out.println("user removed");
		 */
		 
		  //call create User method
		  user.createUser(newuser);
		  newuser.printUser();
		  
		  // set vars & call update user method
		  int newid = 5;
		  String fname = "Dave";
		  String lname = "Deaver";
		  String city = "Dover";
		  user.updateUser(newid, fname, lname, city);
			System.out.println("User Updated");
			user.findUser(newid).printUser();;
	}

}
