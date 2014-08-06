package in.training.careerscale.dao;

import java.sql.CallableStatement;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;



/**
 * 
 * 
 * 
Oracle thin driver connectivity

 DriverName:    oracle.jdbc.driver.OracleDriver 
Connection URL:    "jdbc:oracle:thin:@<hostname>:<port>:<sid>", "<user>", "<password>" 
<machine_name>:<port>    TCP/IP database machine name (e.g. db-new.gsi.de). The port used is 1526 for db.gsi.de (AIX Oracle 7.3) and 1521 for all other cases. 
<sid>:    Database SID. See for a list of SIDs. In case for RAC (on pcora5) you have to select one of the machines explicitly, failover is not supported with ODBC 
<user>:    userid (Schema) to connect to 
<password>:    Password 

 
 * @author  harinath
 *
 */
public class RegistrationDAO {
	private static final String conString = "jdbc:mysql://localhost:3306/office";

	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(conString, "root", "");
	}

 
	public boolean loginWithCredentials(String userName, String password) throws SQLException {
		boolean result = false;
		Connection con = getConnection();
		Statement stmt = con
				.createStatement();
		String query = "select  user_name, password from employee where user_name='" + userName +"' and password = '"+password+"'";
		System.out.println("Query : " +query);
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			// always fetch the data using column names and avoid use of index
			// like rs.getInt(1).. preferred option is to do like
			// rs.getInt("id"). this is future.
			System.out.println( "  user_name  :" + rs.getString("user_name")
					+ "   password :" + rs.getString("password"));
			result = true;
		}
		rs.close();
		con.close();
		
		return result;

	}


	public boolean signingUp(String first_name, String last_name,
			 String user_name , String password) throws SQLException {

		boolean result = false;
		Connection con = getConnection();
        
		String query = "insert into employee(first_name,last_name,user_name,password) values(?, ?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
		
		stmt.setString(1, first_name);
		stmt.setString(2, last_name);
		stmt.setString(3, user_name);
		stmt.setString(4, password);
		
		stmt.execute();
		
		result=true;
		con.close();
		return result;

	}

	
	
	/**
	 * let us learn how to call stored procedure from java.  This includes 
	 *  1.  How to use CallableStatement 
	 *  2.  How to create procedure
	 *  3. How to register and read output parameters
	 *  
	 *  Here is a sample stored procedure for office schema.

    delimiter //
	create procedure getDeptName(IN employee_id integer, out dept_name varchar(100))
		 begin
		select d.name into dept_name from department d, employee e where e.id = employee_id and d.id =e.department_id ;
		end //
	delimiter ;
 	 
 	 
 	 To see the procedures in the database
 	 mysql> show procedure status where Db='office';
 	 * 
	 * @param employeeId the employee Id
	 * @throws SQLException
	 */
	

	/**
	 * @param args
	 */
	
		

	}


