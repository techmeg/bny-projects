package juMain;



import entities.J_User;
import services.J_UserServices;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J_UserServices us = new J_UserServices();
		J_User user = new J_User();
		us.addUser("mlp@nyc.rr.com", "password");
		us.addUser("fff@ggg", "pass1");
		us.addUser("ggg@hhh",  "pass2");

		user.setEmail("mlp@nyc.rr.com");
		user.setPassword("password");
		if (us.login(user)) {
			System.out.println("Welcome");
		}else {
			System.out.println("Invalid user");
		}
//		us.removeUser("mlp@nyc.rr.com");
	}
		


}
