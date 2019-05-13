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
	


	public Teacher(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;

	}
	
	public Teacher() {
		
	}

}
