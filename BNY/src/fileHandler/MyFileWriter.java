package fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileWriter {

	public static void fileWriter(String location, ArrayList<Employee> empList) {
		File file = new File(location);
		try {
			FileWriter writer = new FileWriter(file, false);//false = overwrite; to append -> true
			
//			writer.write("I am the third employee");
			
			writer.write("ID, Name, City \n");//sending the skipped first line header
			for (Employee empl : empList) {
				writer.write(empl.geteId() + ", ");
				writer.write(empl.geteName() + ", ");
				writer.write(empl.geteCity() + "\n");
			}
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} 
	}

}
