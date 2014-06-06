package com.careerscale.training.harsha.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class RegistrationDB {
	
	
	public int dynamicInsertIntoEmployee(String username, String password,
			String fname, String lname, String dob, String email, int mgrID,
			int desgID, int deptID) throws SQLException {
		Connection conn = ConnectionDetails.getConncetion();
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
		if(result!=1)
		{
			return result;
		}
		
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

}
