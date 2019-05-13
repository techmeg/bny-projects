package jdbcTestExercise;

public class Employee {
	private int userID;
	private String fName;
	private String lName;
	private String tel;
	/**
	 * @return the userID
	 */
	int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the fName
	 */
	String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	String getlName() {
		return lName;
	}
	
	String gettel() {
		return tel;
	}
	/**
	 * @param lName the lName to set
	 */
	void setlName(String lName) {
		this.lName = lName;
	}
	public Employee(int userID, String fName, String lName, String tel) {
		this.userID = userID;
		this.fName = fName;
		this.lName = lName;
		this.tel = tel;
	}
	
	//  Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
	static void printEmployee(Employee emp) {
	 
		 System.out.println("ID: " + emp.getUserID() + ", " + emp.getfName() + " " + emp.getlName() + ", " + emp.tel);
		 
	 }
	 void printEmployee() {
		 
		 System.out.println("ID: " + this.userID + ", " + this.fName + " " + this.lName + ", " + this.tel);
		 
	 }
	

}
