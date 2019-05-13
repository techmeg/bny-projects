package readWriteExercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import fileHandler.Employee;

public class UserWrite {

	public static void fileWriter(String blogPath, String blogPost, String person) {
//		System.out.println(blogPath);
//		System.out.println(blogPost);
		File file = new File(blogPath);
		try {
			FileWriter writer = new FileWriter(file, true);//false = overwrite; to append -> true
			

//			writer.write("UserName, Blogpost \n");//sending the skipped first line header
			writer.write(person + ", ");
			writer.write(blogPost + "\n");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
}
