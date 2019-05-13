package NewJDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractDAO {
	private final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String username = "meg2";
	private final String password = "Pass123";
	private final Driver driver = new oracle.jdbc.driver.OracleDriver();
	
	protected Connection conn = null;
	protected PreparedStatement statement = null;
	protected ResultSet results = null;
	
	public void connect () throws SQLException{
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
		}catch (SQLException e) {
			e.getMessage();
		}
	}
	
	public void dispose() {
		try {
			if (!results.equals(null)) {
	//			System.out.println("results are closed");
				if(!results.isClosed()) results.close();
			}
			if (!statement.equals(null)) {
				if(!statement.isClosed()) statement.close();
			}
			if (!conn.equals(null)) {
				if(!conn.isClosed()) conn.close();
			}
		}catch (SQLException e) {}
	}
}
