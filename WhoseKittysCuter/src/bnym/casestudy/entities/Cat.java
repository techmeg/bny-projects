package bnym.casestudy.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	@Column(name="Cat_Id")
	private Long id;
	
	@NotNull
	private String cName;
	
	private int numVotes;
	


	@NotNull
	private String photo;
	
	@NotNull
	private String blurb;

	public Cat(String cName, int numVotes, String photo, String blurb) {
		super();
		this.cName = cName;
		this.numVotes = numVotes;
		this.photo = photo;
		this.blurb = blurb;
	}
	public Cat(){
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return cName;
	}

	public void setName(String cName) {
		this.cName = cName;
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

	public String getBlurb() {
		return blurb;
	}

	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}
}
