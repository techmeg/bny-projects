package wkc.entities;

import java.util.List;

public class Contestant {
	
	private int contestantID;
	private String cName;
	private String cEmail;
	
	private List<Photo> photoList;
	
	public Contestant(int contestantID, String cName, String cEmail) {
		super();
		this.contestantID = contestantID;
		this.cName = cName;
		this.cEmail = cEmail;
	}
	

	public int getContestantID() {
		return contestantID;
	}

	public void setContestantID(int contestantID) {
		this.contestantID = contestantID;
	}
	
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public void register() {}
	
	public void uploadPhoto() {}
	
	public void seeWinnerReport() {}

}
