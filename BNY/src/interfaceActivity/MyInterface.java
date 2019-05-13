/**
 * 
 */
package interfaceActivity;

/**
 * @author margaret.parsons
 *
 */
public interface MyInterface {
	//preferable not to have variables in an Interface, but if there is a constant its OK
	//MUST be initialized, can't be private
	
	String companyName = "Per Scholas";
	
	//overloading is OK 
	void sayHello();
	
	void shakeHand();
}
