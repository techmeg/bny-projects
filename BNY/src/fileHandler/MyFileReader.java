package fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {

	public static ArrayList<Employee> fileReader(String location) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();

		try {	
			
		File file = new File(location);
		Scanner input = new Scanner(file);
		
		input.nextLine();
		String line;
		while(input.hasNextLine()){
			line = input.nextLine();
				if (!line.contentEquals("")) {
				String[] linearr = line.split(",");
				empList.add(new Employee(Integer.parseInt(linearr[0]), linearr[1], linearr[2]));
				}
		}
		} catch (FileNotFoundException e) { //to handle wrong file name
			System.out.println("File not found.");
		} catch (NumberFormatException e) { //to handle corner case of "three" instead of "3" entered in file
			System.out.println("Please check the ID format in the file!");
		}
		return empList;
	}
	
}
