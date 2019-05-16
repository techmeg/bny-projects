package bnym.casestudy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Voter {
	
	@NotEmpty(message="Please add your name")
	@Column(name="Name")
	private String name;
	
	@Id
	@Column(name="Email", nullable=false)
	private String email;
	
	public Voter(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Voter () {
		
	}
	private Long contestId;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContestId() {
		return contestId;
	}

	public void setContestId(Long contestId) {
		this.contestId = contestId;
	}

	
}
