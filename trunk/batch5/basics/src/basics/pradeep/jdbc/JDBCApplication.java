package basics.pradeep.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class JDBCApplication {
	private static final String conString = "jdbc:mysql://localhost:3306/office2";

	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection(conString, "root", "Getlost92");
	}

	public void getEmployees() throws SQLException {

		Connection con = getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt
				.executeQuery("select  user_name,id, password, dob from employee");

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

		String query = "insert into employee(user_name, password,first_name,last_name, manager_id, department_id, designation_id) values(?, ?, ?, ?,?, ?,?)";
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

	public void getDeptNameWithCallableStatement(int employeeId)
			throws SQLException {
		Connection con = getConnection();
		CallableStatement stmt = con.prepareCall("call getDeptName(?,?)");
		stmt.setInt(1, employeeId);
		stmt.registerOutParameter(2, Types.VARCHAR);
		stmt.execute();
		String deptName = stmt.getString(2);
		System.out.println("department name is " + deptName);

	}

	public void batchInsertDemo() throws SQLException {
		Connection con = getConnection();
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.addBatch("insert into department(name) values('department3')");
		stmt.addBatch("insert into department(name) values('department4')");
		stmt.addBatch("insert into department(name) values('department5')");

		int[] result = stmt.executeBatch();
		System.out.println(result);

		con.commit();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JDBCApplication application = new JDBCApplication();
		try {

			application.getEmployees();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
