package bnym.casestudy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Cat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Cat_Id")
	private Long id;
	
	@NotEmpty(message="Please add your cat's name")
	@Column(name="Cat_Name")
	private String cName;
	
	@Column(name="Number_Votes")
	private int numVotes;
	


	@NotEmpty(message="Please choose a file")
	@Column(name="Photo_Link")
	private String photo;
	
	
	@Column(name="Cat_Description")
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
	
	
	
	@Override
	public String toString() {
		return "Cat [id=" + id + ", cName=" + cName + ", numVotes=" + numVotes + ", photo=" + photo + ", blurb=" + blurb
				+ "]";
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
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
