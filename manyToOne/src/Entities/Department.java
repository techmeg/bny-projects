package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Department {

	@Id
	private int did;
	private String dname;
	
	public Department(int did, String dname) {
		this.did = did;
		this.dname = dname;
	}
	
	public Department() {
		
	}
	
}
