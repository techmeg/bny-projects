package bnym.casestudy.entities;

import java.util.Date;
import java.util.List;

public class Contest {
	
	private String contestID;
	private String contestBlurb;
	private int voteCount;
	private String status;
	private Date deadline;
	
	public Contest(String contestID, String contestBlurb, int voteCount, String status, Date deadline) {
		super();
		this.contestID = contestID;
		this.contestBlurb = contestBlurb;
		this.voteCount = voteCount;
		this.status = status;
		this.deadline = deadline;
	}
	
	private List<Contestant> contestantList;
	

	public String getContestID() {
		return contestID;
	}

	public void setContestID(String contestID) {
		this.contestID = contestID;
	}

	public String getContestBlurb() {
		return contestBlurb;
	}

	public void setContestBlurb(String contestBlurb) {
		this.contestBlurb = contestBlurb;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
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
	
	public void updateGallery() {}
	
	public int countVotes() {
		int count = 0;
		
		//code 
		
		return count;
	}
}
