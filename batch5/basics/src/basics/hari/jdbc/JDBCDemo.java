package basics.hari.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
	
	static{
		System.out.println("This is a JDBC program");
	}   

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Class.forName("com.mysql.jdbc.Driver");
		
		List<Connection> myConnections = new ArrayList<Connection>();
		
		
		
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root", "secret");
		
		Statement stmt =con.createStatement();
		//CRUD 
		ResultSet resultSet =stmt.executeQuery("select * from employee");
		
		
		while(resultSet.next()){
			System.out.println(resultSet.getString(1) +"  " + resultSet.getString(2));
		}
		/**
		while(true){
			myConnections.add(DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root", "secret"));
			System.out.println("Connections opened so far : " +myConnections.size());
		}
		
		**/
		
		

	}

}
