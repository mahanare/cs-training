package basics.nitya.jbdc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
	
	public void getRegistrationDet() throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root", "");
		PreparedStatement pstmt = con.prepareStatement("select  id, first from REGISTRATION");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			System.out.println("Employee Id  : " + rs.getInt("id")
					+ "  first_name  :" + rs.getString("first"));
		}
		rs.close();
		con.close();
		
	}
	
	public void insertIntoRegistrationDet(int id,String first) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root", ""); 
		String query = "insert into Registration(id,first)values(?,?)";
		
		PreparedStatement pstm= con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
		pstm.setInt(1,id);
		pstm.setString(2,first);
		
		pstm.execute();
		
		int eId = -1;
		ResultSet rs = pstm.getGeneratedKeys();
        if (rs.next()){
       	eId=rs.getInt(1);
       }
        rs.close();

		System.out.println("Generated employee id :" + eId);
		con.close();	
		
	}
	
	public void updateRegistrationDet()throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root", ""); 
		Statement stmt = con.createStatement();
		int updateFirst = stmt.executeUpdate("update Registration set first='nityaram' where first='ram'");
		System.out.println("No. of rows affected is :" + updateFirst);
		con.close();	
	}
	
	/*public void getFirstNameWithCallableStatement(String first) throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root", ""); 
		CallableStatement stmt = con.prepareCall("call getfirst(?,?)");
		stmt.setString(207, "first");
		stmt.registerOutParameter(1, Types.VARCHAR);
		stmt.execute();
		String firstName =stmt.getString("nr");
		System.out.println("firstname is " + firstName);
	}
	*/
	public static void main(String[] args) throws SQLException{
		
		JDBCDemo app = new JDBCDemo();
		try{
			app.getRegistrationDet();
			//app.insertIntoRegistrationDet(205,"neethu");
			//app.insertIntoRegistrationDet(209,"ram");
			//app.updateRegistrationDet();
			//app.getFirstNameWithCallableStatement("nr");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
		/*Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root", "");
		Statement stmt = conn.createStatement();*/
		
		//String dr = "DROP TABLE REGISTRATION";
		//stmt.execute(dr);
		
	/*	String sql = "CREATE TABLE REGISTRATION " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 
		stmt.execute(sql); 
		
		String sql1= "INSERT INTO Registration " +
                   "VALUES (103, 'Zar', 'Al', 8)";
		stmt.executeUpdate(sql1);
		
		String sql2="INSERT INTO Registration " +
                "VALUES (104, 'Mahna', 'Fata', 2)";
		stmt.executeUpdate(sql2);
		
		String sql3 = "DELETE FROM Registration " +
               "WHERE id = 101";
		
		ResultSet resultSet = stmt.executeQuery("select * from Registration");
		while(resultSet.next()){
			System.out.println(resultSet.getString("id") +"  " + resultSet.getString("last")); */
		}
	}


