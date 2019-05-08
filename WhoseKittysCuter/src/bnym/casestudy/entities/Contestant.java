package bnym.casestudy.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Contestant {

	
	@NotNull
	private String name;
	
	@NotNull
	private Long contestId;
	
	@Id
	private String email;
	
	@OneToOne(optional=false)
    @JoinColumn(name = "Cat_Id")
	private Cat cat;

	public Contestant(String name, String email) {
		super();
		this.name = name;
		this.email = email;

	}
	public Long getContestId() {
		return contestId;
	}
	public void setContestId(Long contestId) {
		this.contestId = contestId;
	}
	public Contestant () {
		
	}

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

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	
}
