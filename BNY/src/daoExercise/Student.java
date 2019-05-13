package daoExercise;

/**
 * @author margaret.parsons
 *
 */
public class Student {
	

	public Student(String name, int rollNo) {
		this.sName = name;
		this.sRollNo = rollNo;
	}
	
	/**
	 * @return the sName
	 */
	String getsName() {
		return sName;
	}
	/**
	 * @param sName the sName to set
	 */
	void setsName(String sName) {
		this.sName = sName;
	}
	/**
	 * @return the sRollNo
	 */
	int getsRollNo() {
		return sRollNo;
	}
	/**
	 * @param sRollNo the sRollNo to set
	 */
	void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}

	private String sName;
	private int sRollNo;
	
	

}
