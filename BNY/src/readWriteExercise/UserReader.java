package readWriteExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class UserReader {

	public static HashMap<String, String> fileReader(String passwordPath) {

	HashMap<String, String> userList = new HashMap<String, String>();

	try {	
		
	File file = new File(passwordPath);
	Scanner input = new Scanner(file);
	
	input.nextLine();
	String line;
	while(input.hasNextLine()){
		line = input.nextLine();
			if (!line.contentEquals("")) {
			String[] linearr = line.split(",");
			userList.put(linearr[0], linearr[1]);
			}
	}input.close();
	} catch (FileNotFoundException e) { //to handle wrong file name
		System.out.println("File not found.");

	}
	return userList;
}
}
