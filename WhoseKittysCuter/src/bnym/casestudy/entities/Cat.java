package bnym.casestudy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Cat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Cat_Id")
	private Long id;
	
	@NotNull
	private String cName;
	
	@ManyToOne
	@JoinColumn
	private Contest contest;

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
	
	
	@Override
	public String toString() {
		return "Cat [id=" + id + ", cName=" + cName + ", contest=" + contest + ", numVotes=" + numVotes + ", photo="
				+ photo + ", blurb=" + blurb + "]";
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
	public Contest getContest() {
		return contest;
	}
	public void setContest(Contest contest) {
		this.contest = contest;
	}
	
}
