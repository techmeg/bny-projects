package com.bnym.entities;


import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Applicant {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//use Long because list won't accept a primitive; needs Wrapper
	private Long id;
	
	@NotEmpty(message="Name field cannot be empty.")
	@Size(max=25, message="Name must be less than 25 characters.")
	private String sName;
	
	@NotEmpty(message="Course Name cannot be empty.")
	private String sCourse;
	
	@Pattern(regexp="^\\D?(\\d{3})\\D?\\D?(\\d{3})\\D?(\\d{4})$", message="Please match pattern 111-222-3333")
	private String sMobile;
	
	@Past(message="Date cannot be in the future.")
	private Date sDOB;
	
	@NotEmpty
	@ElementCollection(fetch=FetchType.EAGER, targetClass=String.class)
	private List<String> sSkills;
	
	@NotNull
	@Valid
	@OneToOne(cascade = CascadeType.PERSIST)//makes the address be saved first, as it is dependent on Applicant
	private Address sAddress;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCourse() {
		return sCourse;
	}
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	public String getsMobile() {
		return sMobile;
	}
	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}
	public Date getsDOB() {
		return sDOB;
	}
	public void setsDOB(Date sDOB) {
		this.sDOB = sDOB;
	}
	public List<String> getsSkills() {
		return sSkills;
	}
	public void setsSkills(List<String> sSkills) {
		this.sSkills = sSkills;
	}
	public Address getsAddress() {
		return sAddress;
	}
	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}

}


