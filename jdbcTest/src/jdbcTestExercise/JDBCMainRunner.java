/**
 * 
 */
package jdbcTestExercise;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 * @author margaret.parsons
 *
 */
public class JDBCMainRunner {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "meg2";
		String password = "Pass123";
		
		//establish connection to database
		Connection conn = DriverManager.getConnection(url, username, password);
		//check if connection is valid
		if (conn.isValid(1)) {
			System.out.println("You have a valid connection");
		}else {
			System.out.println("Check your settings");
		}
		
		
		//make a query 
		Statement myStatement = conn.createStatement();
		
		ResultSet rs; //declare a result set object
		int start = 1; //if getting more than one record set start and end of ask
		int end = 10;
		//get one employee
		//rs=myStatement.executeQuery("SELECT * FROM jpaEmployee WHERE userid = 1");
		
		//get many employees
		rs=myStatement.executeQuery("SELECT * FROM jpaEmployee WHERE userid > " + start + " AND userid < " + end);
		//instantiate Employee List
		List<Employee> employees = new ArrayList<Employee>();
		
		while(rs.next()) {//sets pointer to first row of result set query -- assuming there is data!!
//			System.out.println("ID: " + rs.getInt(1) + ", " + rs.getString(2) + " " + rs.getString(3));
		
			Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			employees.add(emp);
		
//		emp.printEmployee(); // for printing one record
//		System.out.println("ID: " + emp.getUserID() + ", " + emp.getfName() + " " + emp.getlName() + ", " + emp.gettel());
		}
		//print employee list
		for (Employee emp : employees) {
			System.out.println("ID: " + emp.getUserID() + ", " + emp.getfName() + " " + emp.getlName() + ", " + emp.gettel());
		}conn.close();
		rs.close();
	}  
		 
}


