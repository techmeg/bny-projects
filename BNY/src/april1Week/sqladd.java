package april1Week;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class sqladd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File afile = new File("D:\\Users\\margaret.parsons\\eclipse-workspace\\BNY\\src\\april1Week\\sqlinsert.txt");
		FileWriter fw = new FileWriter (afile, false);
		
		for (int i = 0; i<100; i++) {
			fw.write ("insert into jpaEmployee2 values ( "
			+ i

			+ ", \'fname" + i + "\'"

			+ ", \'lname" + i + "\'"

			+ ", \'5551212" + i + "\'"

			+ ");\n"

			);

			}

			fw.close();

		}

	}


