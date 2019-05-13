package readWriteExercise;

public class User {
	
	public User(String uName, String uPassword) {
		this.uName = uName;
		this.uPassword = uPassword;
	}
	/**
	 * @return the uName
	 */
	String getuName() {
		return uName;
	}
	/**
	 * @param uName the uName to set
	 */
	void setuName(String uName) {
		this.uName = uName;
	}
	/**
	 * @return the uPassword
	 */
	String getuPassword() {
		return uPassword;
	}
	/**
	 * @param uPassword the uPassword to set
	 */
	void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	private String uName;
	private String uPassword;
	
	public String toString() {
		return this.uName + ", " + this.uPassword;
	}
}
