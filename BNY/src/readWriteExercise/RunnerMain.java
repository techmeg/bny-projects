/**
 * 
 */
package readWriteExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author margaret.parsons
 * Program to enter user blog post
 */
public class RunnerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// name file path to read and instantiate class
		String passwordPath = "D:\\Users\\margaret.parsons\\eclipse-workspace\\BNY\\src\\readWriteExercise\\userPWs.txt";

		//read the doc into arraylist
		//call fileReader method in UserReader class
		HashMap<String, String> userList = UserReader.fileReader(passwordPath);
		
		//print userList
		for (Map.Entry<String, String> entry : userList.entrySet())
			System.out.println(entry.getKey() + ", " + entry.getValue());
			System.out.println();
		//what is your username

		System.out.println("Enter your username");
		Scanner scan = new Scanner(System.in);
		String person = scan.next();
		int i = 0;

		while(i<3) {
		//check against list
		if (userList.containsKey(person)) {
			//what is your password 
	
			System.out.println("Enter your password.");
			String password = scan.next();
			
			//if PW Valid: What do you want to blog?
			if(userList.get(person).equals(password)) {
				i=4;
				System.out.println("Enter your blog post");
				String blogPost = scan.next();//?? what the heck? won't take nextLine()
				//write to blog to file
				UserWrite.fileWriter("D:\\Users\\margaret.parsons\\eclipse-workspace\\BNY\\src\\readWriteExercise\\myBlog.txt", blogPost, person);
			}else { //-- 3 tries while loop
					i++;
					if(i==1) {
						System.out.println("Password Invalid, Try Again (2 more tries).");
					}else if (i==2) {
						System.out.println("Password Invalid. One more try.");
					}else {
						System.out.println("Invalid password; contact your administrator");
					}

				}
			}
		}
		
	}
}


