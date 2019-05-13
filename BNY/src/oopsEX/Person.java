package oopsEX;

public class Person {

		private static String a = "unmodified";
		private String b = "unmodified";
		
		public  void setA(String newA) {
			a=newA;	
		}
		public  String getA() {
			return a;
		}
		public String getThisA() {
			return this.a;
		}
		public void setB(String newB) {
			this.b = newB;
		}
		public String getB() {
			return this.b;
		}
	
}
