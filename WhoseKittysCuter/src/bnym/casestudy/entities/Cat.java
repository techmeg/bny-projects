package bnym.casestudy.entities;

public class Cat {
	
	private int catID;
	private String catName;
	private int numVotes;
	private String photoLink;
	private String catBlurb;
	
	public Cat(int catID, String catName, String photoLink, String catBlurb) {
		super();
		this.catID = catID;
		this.catName = catName;
		this.numVotes = 1;
		this.photoLink = photoLink;
		this.catBlurb = catBlurb;
	}

	public int getCatID() {
		return catID;
	}

	public void setCatID(int catID) {
		this.catID = catID;
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

	public String getPhotoLink() {
		return photoLink;
	}

	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}
	
	public String getCatBlurb() {
		return catBlurb;
	}
	
	public void setCatBlurb(String catBlurb) {
		this.catBlurb = catBlurb;
	}

}
