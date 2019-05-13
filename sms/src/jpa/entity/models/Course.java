package jpa.entity.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Course {
	
	@Id
	@Column(name="id")
	private int cId;
	
	@Column(name="name")
	private String cName;
	
	@Column(name="Instructor")
	private String cInstructorName;

	/**
	 * @return the cId
	 */
	public int getcId() {
		return cId;
	}

	/**
	 * @param cId the cId to set
	 */
	public void setcId(int cId) {
		this.cId = cId;
	}

	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}

	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}

	/**
	 * @return the cInstructorName
	 */
	public String getcInstructorName() {
		return cInstructorName;
	}

	/**
	 * @param cInstructorName the cInstructorName to set
	 */
	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

	public Course(int cId, String cName, String cInstructorName) {
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}
	
	public Course () {
		this.cId=999;
		this.cName = "default";
		this.cInstructorName="default";
	}

}
