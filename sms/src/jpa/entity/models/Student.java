package jpa.entity.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Student {
	
	@Id
	@Column(name="email")
	private String sEmail;
	
	@Column(name="name")
	private String sName;
	
	@Column(name="password")
	private String sPass;
	
	@OneToMany
	private List<Course> sCourses;

	public Student(String sEmail, String sName, String sPass) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
	}
	public Student() {
		this.sEmail = "default";
		this.sName = "default";
		this.sPass = "default";
	}
	/**
	 * @return the sEmail
	 */
	public String getsEmail() {
		return sEmail;
	}
	/**
	 * @param sEmail the sEmail to set
	 */
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}
	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}
	/**
	 * @return the sPass
	 */
	public String getsPass() {
		return sPass;
	}
	/**
	 * @param sPass the sPass to set
	 */
	public void setsPass(String sPass) {
		this.sPass = sPass;
	}
	/**
	 * @return the sCourses
	 */
	public List<Course> getsCourses() {
		return sCourses;
	}
	/**
	 * @param sCourses the sCourses to set
	 */
	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	

}
