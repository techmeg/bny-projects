package com.jpaTest.services;

import com.jpaTest.entities.Employee;

public interface EmployeeDAO {

	void createEmployee(Employee emp);
	
	void removeEmployee(int id);
	Employee findEmployee(int id);
	void updateEmployeeTel(int id, String tel);
}
