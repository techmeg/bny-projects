package bnym.casestudy.entities;

public class Winner {

	private int contestID;
	private String photoID;
	
	public Winner(int contestID, String photoID) {
		super();
		this.contestID = contestID;
		this.photoID = photoID;
	}

	public int getContestID() {
		return contestID;
	}

	public void setContestID(int contestID) {
		this.contestID = contestID;
	}

	public String getPhotoID() {
		return photoID;
	}

	public void setPhotoID(String photoID) {
		this.photoID = photoID;
	}
	
	
}
