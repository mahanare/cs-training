package basics.hari.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 * 
 * 
 * 
 Oracle thin driver connectivity
 * 
 * DriverName: oracle.jdbc.driver.OracleDriver Connection URL:
 * "jdbc:oracle:thin:@<hostname>:<port>:<sid>", "<user>", "<password>"
 * <machine_name>:<port> TCP/IP database machine name (e.g. db-new.gsi.de). The
 * port used is 1526 for db.gsi.de (AIX Oracle 7.3) and 1521 for all other
 * cases. <sid>: Database SID. See for a list of SIDs. In case for RAC (on
 * pcora5) you have to select one of the machines explicitly, failover is not
 * supported with ODBC <user>: userid (Schema) to connect to <password>:
 * Password
 * 
 * 
 * @author harinath
 * 
 */
public class JDBCApplication {
	private static final String conString = "jdbc:mysql://localhost:3306/office";

	// private static final String conString = "jdbc:odbc:office-odbc";

	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection(conString, "root", "root");
	}

	public void getEmployees() throws SQLException {

		Connection con = getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt
				.executeQuery("select  user_name,id, password from employee");

		while (rs.next()) {
			// always fetch the data using column names and avoid use of index
			// like rs.getInt(1).. preferred option is to do like
			// rs.getInt("id"). this is future.
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
			// always fetch the data using column names and avoid use of index
			// like rs.getInt(1).. preferred option is to do like
			// rs.getInt("id"). this is future.
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

	/**
	 * let us learn how to call stored procedure from java. This includes 1. How
	 * to use CallableStatement 2. How to create procedure 3. How to register
	 * and read output parameters
	 * 
	 * Here is a sample stored procedure for office schema.
	 * 
	 * delimiter // create procedure getDeptName(IN employee_id integer, out
	 * dept_name varchar(100)) begin select d.name into dept_name from
	 * department d, employee e where e.id = employee_id and d.id
	 * =e.department_id ; end // delimiter ;
	 * 
	 * 
	 * To see the procedures in the database mysql> show procedure status where
	 * Db='office';
	 * 
	 * @param employeeId
	 *            the employee Id
	 * @throws SQLException
	 */

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
		stmt.addBatch("insert into department(name) values('department7')");
		stmt.addBatch("insert into department(name) values('department8')");
		stmt.addBatch("insert into department(name) values('department9')");

		int[] result = stmt.executeBatch();
		System.out.println(result);

		con.commit();

		// con.rollback();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JDBCApplication application = new JDBCApplication();
		try {

			// application.updateEmployee();
			// application.insertEmployees("neelima" + Math.random(),
			// "test1","neelima", "lastname", 3, 2, 1);
			// application.getEmployees();
			// application.getDeptNameWithCallableStatement(2);
			application.batchInsertDemo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
