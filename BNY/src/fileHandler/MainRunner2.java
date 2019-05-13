package fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "D:\\Users\\margaret.parsons\\eclipse-workspace\\BNY\\src\\fileHandler\\text2.txt";
		
		//need to call using class name.methodName
		ArrayList<Employee> empList = MyFileReader.fileReader(location);
		
		for(Employee emp : empList) {
//			for (String token : line) {
//			System.out.print(token);
			System.out.println(emp.toString());
			}
//		}System.out.println();
		
		Employee emp1 = new Employee(003, "Tom", "San Jose");
		Employee emp2 = new Employee(004, "David", "San Jose");
		Employee emp3 = new Employee(005, "Kevin", "San Jose");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		MyFileWriter.fileWriter(location, empList);


	}

}
