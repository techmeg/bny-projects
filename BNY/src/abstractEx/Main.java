package abstractEx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractStudent student = new Student();
		student.setFirstName("Mike");
		student.setLastName("Gabriel");
		student.setGpa(4);
		student.getInfo();
		
		StudentI student2 = new StudentImp();
		student2.setName("Mike");
		student2.introduceSelf();
	}

}
