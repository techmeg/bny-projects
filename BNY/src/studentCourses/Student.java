package studentCourses;

import java.util.List;

public class Student {

	int sId;
	String sName;
	List<Course> sCourses; 
	
	Student(int sId, String sName, List<Course> sCourses){
		this.sId = sId;
		this.sName = sName;
		this.sCourses = sCourses;
	}
	void printStudent() {
		System.out.println(sId);
		System.out.println(sName);
		for(Course c: sCourses ) {
			System.out.println(c.cName);
		}
	}
	void dropCourse (String dropCourse) {
		boolean deleted = false;
		
		for (int i = 0; i<sCourses.size(); i++) {
			if (sCourses.get(i).cName.equals(dropCourse)) {
				sCourses.remove(sCourses.get(i));
				deleted = true;
			}
				
		
		}if (deleted) {
			System.out.println(dropCourse + ": Removed successfully");
		}else {
			System.out.println(dropCourse + ": is not on your course list");
		}
	}
}
