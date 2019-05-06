package bnym.casestudy.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Cat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long catId;
	
	@NotNull
	private String catName;
	
	private int numVotes;
	
	@NotNull
	private String photo;
	
	@NotNull
	private String catBlurb;
	
	public Cat(String catName, String photo, String catBlurb) {
		super();
		this.catName = catName;
		this.photo = photo;
		this.catBlurb = catBlurb;
	}
	
	public Cat() {
		
	}


	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCatBlurb() {
		return catBlurb;
	}
	
	public void setCatBlurb(String catBlurb) {
		this.catBlurb = catBlurb;
	}

}
