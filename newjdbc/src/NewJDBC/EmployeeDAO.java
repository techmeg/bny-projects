package NewJDBC;

import java.util.List;

public interface EmployeeDAO {

	enum SQLQueries {
		GET_ALL_EMPLOYEES ("SELECT * FROM jpaEmployees"),
		GET_EMPLOYEE_BY_ID("SELECT * FROM jpaEmployees WHERE userID = ?");
		private final String query;
		//constructor for SQLQueries; gets string from result set (I think!)
		private SQLQueries(String s) {
			this.query = s;
		}
		public String getQuery() {
			return query;
		}
	}
		public List<Employee> getAllEmployees();
		
		public Employee getEmployeeByID(int id);
	
}
