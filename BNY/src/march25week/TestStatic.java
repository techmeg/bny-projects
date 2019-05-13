/**
 * 
 */
package march25week;

/**
 * @author margaret.parsons
 *
 */
public class TestStatic {

	/**
	 * @param args
	 */
	
	static int keyChain = 0; //this variable could be accessed from anywhere...
	int eyeglasses = 0;//this variable can only be used in this class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keyChain();
	}
	static void keyChain() {
		keyChain++;
		System.out.println(keyChain);
	}
	
	void  eyeglasses() {
		eyeglasses++;
		System.out.println(eyeglasses);//this won't print until method is invoked from the main method
		

	}
}
