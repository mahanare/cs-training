package basics.nitya.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
	
	public static void main(String[] args) throws SQLException{
		
		//List<Connection> Myconn = new ArrayList<Connection>();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root", "secret");
		Statement stmt = conn.createStatement();
		String sql = "CREATE TABLE REGISTRATION " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 
		String sql1= "INSERT INTO Registration " +
                   "VALUES (100, 'Zara', 'Ali', 18)";
		stmt.executeUpdate(sql1);
		
		String sql2="INSERT INTO Registration " +
                "VALUES (101, 'Mahnaz', 'Fatma', 25)";
		stmt.executeUpdate(sql2);
		
		String sql3 = "DELETE FROM Registration " +
                "WHERE id = 101";
		
		ResultSet resultSet = stmt.executeQuery("select * from employee");
		while(resultSet.next()){
			System.out.println(resultSet.getString(1) +"  " + resultSet.getString(2));
		}
	}

}
