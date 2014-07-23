package in.careerscale.training.hari.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCTest {
	
	
	
	@Test public void JDBCTest() throws SQLException{
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "secret");
	
		Statement stmt =con.createStatement();
		ResultSet results = stmt.executeQuery("select * from employee");
		
		while(results.next()){
			System.out.println("Employee Id : " +results.getInt(1)  + " :: Employee Name " + results.getString(	"first_name") );
		
		}
		
		
	}

}
