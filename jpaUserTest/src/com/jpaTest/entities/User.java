package com.jpaTest.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import java.util.List;
@Entity
@Table(name="tbl_users")

public class User {

	@Id
	@Column
	private int userID;
	
	@Basic
	@Column
	private String firstName;
	
	@Basic
	@Column
	private String lastName;
	
	@Basic
	@Column
	private String city;
	
	public User () {

	}

	public User(int userID, String firstName, String lastName, String city) {
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}

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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	

	 public void printUser() {
		 
		 System.out.println("ID: " + this.userID + ", " + this.firstName + " " + this.lastName + ", " + this.city);
	 }	
}
