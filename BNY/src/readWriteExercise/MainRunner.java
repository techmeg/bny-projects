/**
 * 
 */
package readWriteExercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author margaret.parsons
 * Program to enter user blog post
 */
public class MainRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// name file path to read and instantiate class
		String passwordPath = "D:\\Users\\margaret.parsons\\eclipse-workspace\\BNY\\src\\readWriteExercise\\userPWs.txt";

		//read the doc into arraylist
		//call fileReader method in UserReader class
		ArrayList<User> userList = UserReader.fileReader(passwordPath);
		
		//print userList
		for(User user : userList) {
			System.out.println(user.toString());
		}
		//what is your username

		System.out.println("Enter your username");
		Scanner scan = new Scanner(System.in);
		String person = scan.next();
		
		//check against list
			for (User user : userList) {
			//if username exists, 
			if (person == user.getuName()){
				int index = userList.indexOf(person);
				int i = 1;
				//what is your password -- 3 tries (while loop)
				while(i<=3) {
					System.out.println("Enter your password.");
					String password = scan.next();
					
					//if PW Valid: What do you want to blog?
					if(password == userList(index).uPassword) {
							System.out.println("Enter your blog post");
							String blogPost = scan.nextLine();
							//write to blog to file
							UserWrite.fileWriter("D:\\Users\\margaret.parsons\\eclipse-workspace\\BNY\\src\\readWriteExercise\\myBlog.txt", blogPost);
					}else {
						System.out.println("Password Invalid, Try Again (2 more tries).");
					}

				}
			//else exit	
			}else {
					break;
			}

			}
	}

}
