package fileHandler;

public class Employee {
	
	public Employee(int eId, String eName, String eCity) {
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}
	private int eId;
	private String eName;
	private String eCity;
	/**
	 * @return the eId
	 */
	 int geteId() {
		return eId;
	}
	/**
	 * @param eId the eId to set
	 */
	 void seteId(int eId) {
		this.eId = eId;
	}
	/**
	 * @return the eName
	 */
	 String geteName() {
		return eName;
	}
	/**
	 * @param eName the eName to set
	 */
	 void seteName(String eName) {
		this.eName = eName;
	}
	/**
	 * @return the eCity
	 */
	 String geteCity() {
		return eCity;
	}
	/**
	 * @param eCity the eCity to set
	 */
	 void seteCity(String eCity) {
		this.eCity = eCity;
	}
	 //overriding usual toString method; normally for object would return the memory address
	public String toString() {
		return this.eId + " " + this.eName + " " + this.eCity + " ";
	}
}
