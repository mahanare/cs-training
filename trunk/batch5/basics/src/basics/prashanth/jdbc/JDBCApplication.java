package basics.prashanth.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApplication {
	private static final String conString = "jdbc:mysql://localhost:3306/office3";

	// private static final String conString = "jdbc:odbc:office3-odbc";

	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection(conString, "root", "root");
	}

	public void getEmployees() throws SQLException {

		Connection con = getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt
				.executeQuery("select  user_name,id, password from employee");

		while (rs.next()) {
			System.out.println("Employee Id  : " + rs.getInt("id")
					+ "  user_name  :" + rs.getString("user_name")
					+ "   password :" + rs.getString("password"));
		}
		rs.close();
		stmt.close();
		con.close();

	}

	public void getEmployeesWithPreparedStatement() throws SQLException {

		Connection con = getConnection();
		PreparedStatement stmt = con
				.prepareStatement("select  user_name,id, password from employee");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {

			System.out.println("Employee Id  : " + rs.getInt("id")
					+ "  user_name  :" + rs.getString("user_name")
					+ "   password :" + rs.getString("password"));
		}
		rs.close();
		con.close();

	}

	public void insertEmployees(String userName, String password,
			String firstName, String lastName, int managerId, int departmentId,
			int designationId) throws SQLException {

		Connection con = getConnection();

		String query = "insert into employee(user_name, password,first_name,last_name, manager_id, dept_id, desig_id) values(?, ?, ?, ?,?, ?,?)";
		PreparedStatement stmt = con.prepareStatement(query,
				Statement.RETURN_GENERATED_KEYS);

		stmt.setString(1, userName);
		stmt.setString(2, password);
		stmt.setString(3, firstName);
		stmt.setString(4, lastName);
		stmt.setInt(5, managerId);
		stmt.setInt(6, departmentId);
		stmt.setInt(7, designationId);

		stmt.execute();

		int employeeId = -1;
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			employeeId = rs.getInt(1);
		}
		rs.close();

		System.out.println("Generated employee id :" + employeeId);
		con.close();

	}

	public void updateEmployee() throws SQLException {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		int updatedRowsCount = stmt
				.executeUpdate("update employee set password ='test3' where user_name='hari' ");
		System.out.println("No. of rows affected is :" + updatedRowsCount);

	}

	public static void main(String[] args) {

		JDBCApplication application = new JDBCApplication();
		try {

			// application.updateEmployee();
			application.insertEmployees("ravi" + Math.random(), "test1",
					"ravi", "lastname", 3, 2, 1);
			// application.getEmployees();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
