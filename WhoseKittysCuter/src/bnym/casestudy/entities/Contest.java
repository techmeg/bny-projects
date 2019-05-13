package bnym.casestudy.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Contest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull(message="Name field cannot be empty.")
	private String contestName;
	
	@NotNull(message="Field cannot be empty.")
	private String contestBlurb;
	
	@NotNull(message="Field cannot be empty.")
	private String status;
	
	@NotNull(message="Field cannot be empty.")
	private Date deadline;
	
	@OneToMany(mappedBy = "contest", cascade = CascadeType.ALL)
	private List<Cat> catList;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval=true)
	private Winner winner;
	
	public Contest(String contestName, String contestBlurb, String status, Date deadline) {
		this.contestName = contestName;
		this.contestBlurb = contestBlurb;
		this.status = status;
		this.deadline = deadline;
	}

	public Contest() {
		
	}



	@Override
	public String toString() {
		return "Contest [id=" + id + ", contestName=" + contestName + ", contestBlurb=" + contestBlurb + ", status="
				+ status + ", deadline=" + deadline + ", catList=" + catList + ", winner=" + winner + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContestName() {
		return contestName;
	}

	public void setContestName(String contestName) {
		this.contestName = contestName;
	}


	public String getContestBlurb() {
		return contestBlurb;
	}

	public void setContestBlurb(String contestBlurb) {
		this.contestBlurb = contestBlurb;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	public Winner getWinner() {
		return winner;
	}

	public void setWinner(Winner winner) {
		this.winner = winner;
	}

	
	public List<Cat> getCatList() {
		return catList;
	}

	public void setCatList(List<Cat> catList) {
		this.catList = catList;
	}
}
