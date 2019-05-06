package bnym.casestudy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Voter {
	
	@NotNull
	private String name;
	
	@Id
	private String email;
	
	public Voter(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Voter () {
		
	}
	private Long contestId;
	private String photo;
	
	
	

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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}


	
	

	
	
	public void register() {}
	
	public void uploadPhoto() {}
	
	public void seeWinnerReport() {}

}
