package practiceJavabook;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Before #Objects " + CircleWithStaticMembers.numberOfObjects);
			
			CircleWithStaticMembers c1 = new CircleWithStaticMembers();
			
			System.out.println("After, radius: " + c1.radius + "#Objects" + c1.numberOfObjects);

			
	}

}
