package basics.harsha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection{
	private static String url = "jdbc:mysql://localhost:3306/employeeschema";
	private static String user = "root";
	private static String pass = "pass";
	
	public static Connection getConncetion() throws SQLException
	{
		Connection conn = DriverManager.getConnection(url, user, pass);
		return conn;
		
	}

}
