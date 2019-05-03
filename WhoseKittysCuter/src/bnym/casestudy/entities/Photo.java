package bnym.casestudy.entities;

public class Photo {

	private int photoID;
	private int catID;
	private int contestID;
	
	public int getPhotoID() {
		return photoID;
	}

	public void setPhotoID(int photoID) {
		this.photoID = photoID;
	}

	public int getCatID() {
		return catID;
	}

	public void setCatID(int catID) {
		this.catID = catID;
	}

	public int getContestID() {
		return contestID;
	}

	public void setContestID(int contestID) {
		this.contestID = contestID;
	}

	public Photo(int photoID, int catID, int contestID) {
		super();
		this.photoID = photoID;
		this.catID = catID;
		this.contestID = contestID;
	}
	
	
	
}
