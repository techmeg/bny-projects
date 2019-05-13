package com.jpaTest.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



//import java.util.List;
@Entity
@Table(name="jpaEmployee")

public class Employee {
	
	//properties
	@Id
	@Column(name="userID")
	private int userID;
	
	@Basic
	@Column(name="fName")
	private String fName;
	
	@Basic
	@Column(name="lName")
	private String lName;
	
	@Basic
	@Column(name="tel")
	private String tel;
	
	//getters & setters
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	
	public String gettel() {
		return tel;
	}
	public void settel(String tel) {
		this.tel = tel;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public Employee() {
		super();
	}
	
	
	public Employee(int userID, String fName, String lName, String tel) {
	  this.userID = userID; 
	  this.fName = fName; 
	  this.lName = lName; 
	  this.tel = tel;
	  }
	 
	public void printEmployee(Employee emp) {
	 
		 System.out.println("ID: " + emp.getUserID() + ", " + emp.getfName() + " " + emp.getlName() + ", " + emp.tel);
		 
	 }
	 public void printEmployee() {
		 
		 System.out.println("ID: " + this.userID + ", " + this.fName + " " + this.lName + ", " + this.tel);
		 
	 }	 
	 
	



}
