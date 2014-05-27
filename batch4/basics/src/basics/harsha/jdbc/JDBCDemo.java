package basics.harsha.jdbc;

import java.sql.*;
import java.util.*;

public class JDBCDemo {

	public int insertIntoEmployee() throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String userName = sc.nextLine();

		System.out.println("Enter password");
		String password = sc.next();

		System.out.println("Enter First Name");
		String fname = sc.nextLine();

		System.out.println("Enter Last Name");
		String lname = sc.nextLine();

		System.out.println("Enter date of birth in 'yyyy-mm-dd' format");
		String dob = sc.next();

		System.out.println("Enter email ID");
		String email = sc.next();

		System.out.println("Enter manager ID");
		int mgrID = sc.nextInt();

		System.out.println("Enter designation ID");
		int desgID = sc.nextInt();

		System.out.println("Enter department ID");
		int deptID = sc.nextInt();

		String query = "insert into employee values ('" + userName + "','"
				+ password + "','" + fname + "','" + lname + "','" + dob
				+ "','" + email + "','" + mgrID + "','" + desgID + "','"
				+ deptID + ")";
		Connection conn = JDBCConnection.getConncetion();

		PreparedStatement stmt = conn.prepareStatement(query);
		int result = stmt.executeUpdate();

		System.out.println("1 row inserted");
		conn.close();
		sc.close();
		return result;
	}

	public int dynamicInsertIntoEmployee(String username, String password,
			String fname, String lname, String dob, String email, int mgrID,
			int desgID, int deptID) throws SQLException {
		Connection conn = JDBCConnection.getConncetion();
		String query = "insert into employee(user_name, password, first_name,last_name,birth_date,email_ID,manager_ID,designation_ID,department_ID) values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
		
		stmt.setString(1, username);
		stmt.setString(2, password);
		stmt.setString(3, fname);
		stmt.setString(4, lname);
		stmt.setString(5, dob);
		stmt.setString(6, email);
		stmt.setInt(7, mgrID);
		stmt.setInt(8, desgID);
		stmt.setInt(9, deptID);
		
		int result = stmt.executeUpdate();
		
		int employeeId = -1;
		ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
        	employeeId=rs.getInt(1);
        }
        System.out.println("Generated employee id :" + employeeId);
		
		System.out.println("1 row inserted");
		conn.close();
		return result;
	}

	public String selectFromEmployee() throws SQLException {
		Connection conn = JDBCConnection.getConncetion();
		String query = "select * from employee";
		PreparedStatement stmt = conn.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}

		conn.close();
		return null;
	}

	public int insertIntoDepartment() throws SQLException {
		Connection conn = JDBCConnection.getConncetion();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the new department");
		String deptName = sc.nextLine();

		String query = "insert into department(dept_name) values ('" + deptName
				+ "')";
		PreparedStatement stmt = conn.prepareStatement(query);
		int result = stmt.executeUpdate();

		System.out.println("1 row inserted");
		conn.close();
		sc.close();
		return result;

	}

	public int selectFromDepartment() throws SQLException {
		Connection conn = JDBCConnection.getConncetion();

		String query = "select * from department";
		PreparedStatement stmt = conn.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		int count = 0;

		while (rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			count++;
		}

		conn.close();
		return count;
	}

	public int insertIntoDesignation() throws SQLException {
		Connection conn = JDBCConnection.getConncetion();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the new designation");
		String deignationTitle = sc.nextLine();

		String query = "insert into designation(title) values ('"
				+ deignationTitle + "')";
		PreparedStatement stmt = conn.prepareStatement(query);
		int result = stmt.executeUpdate();

		System.out.println("1 row inserted");
		conn.close();
		sc.close();
		return result;

	}
	
	public int getCountOfEmployeesFromDepartment(String deptName) throws SQLException
	{
		Connection con = JDBCConnection.getConncetion();
		CallableStatement stmt = con.prepareCall("call getCountEmployeesFromDepartment(?,?)");
		
		stmt.setString(1, deptName);
		stmt.registerOutParameter(2, Types.INTEGER);
		stmt.execute();
		
		int count = stmt.getInt(2);
		System.out.println("the number of employees is "+ count);
		return count;
	}

}
