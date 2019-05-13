package fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {	
		String location = "D:\\Users\\margaret.parsons\\eclipse-workspace\\BNY\\src\\fileHandler\\text.txt";
		
		File file = new File(location);
		Scanner input = new Scanner(file);
		
		ArrayList<String> data = new ArrayList<String>();
//		String data = "";
		while(input.hasNextLine()) {
//			data += input.nextLine();
			data.add(input.nextLine());
		}
//		String line = input.nextLine();
//		System.out.println(line);  //line gets one line
		for(String line: data) {
			System.out.println(line);
		}
		
//		System.out.println(data);  // gets all lines
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found.");
		}
		
	}

}
