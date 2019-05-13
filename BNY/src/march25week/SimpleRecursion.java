package march25week;

public class SimpleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		recFun(num);
	}
	static void recFun(int num) {
		if(num == 0) {
			System.out.println(num);
		}else {
			num = num-2;
			System.out.println("iterations: " + num);
			recFun(num);
		}
 
	}
}
