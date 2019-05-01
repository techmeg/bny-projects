package wkc.entities;

public class Voter {
	
	private String vEmail;
	private int contestID;
	private int photoID;
	
	
	public Voter(String vEmail, int contestID, int photoID) {
		super();
		this.vEmail = vEmail;
		this.contestID = contestID;
		this.photoID = photoID;
	}
	
	public String getvEmail() {
		return vEmail;
	}
	public void setvEmail(String vEmail) {
		this.vEmail = vEmail;
	}
	public int getContestID() {
		return contestID;
	}
	public void setContestID(int contestID) {
		this.contestID = contestID;
	}
	public int getPhotoID() {
		return photoID;
	}
	public void setPhotoID(int photoID) {
		this.photoID = photoID;
	}
	

	

	

}
