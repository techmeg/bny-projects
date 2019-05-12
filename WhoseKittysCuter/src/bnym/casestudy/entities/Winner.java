package bnym.casestudy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Winner {
	
	@Id
	private Long id;
	//this ID represents ContestID
	
	private String contestantName;
	
	private String catName;
	
	private String photo;

	public Winner() {
		
	}

	

	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}



	


	@Override
	public String toString() {
		return "Winner [id=" + id + ", contestantName=" + contestantName + ", catName=" + catName + ", photo=" + photo
				+ "]";
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getContestantName() {
		return contestantName;
	}

	public void setContestantName(String contestantName) {
		this.contestantName = contestantName;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	

}
