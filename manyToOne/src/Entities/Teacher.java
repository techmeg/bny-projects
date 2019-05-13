package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {
	
	@Id
	private int eid;
	private String ename;
	private double salary;
	
	@ManyToOne
	private Department department;

	public Teacher(int eid, String ename, double salary, Department department) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}
	
	public Teacher() {
		
	}

}
