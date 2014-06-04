package com.careerscale.training.harsha.db;

import java.sql.*;



public class LoginDB {

	public String loginAuthentication(String user, String pass) throws SQLException
	{
		String query = "select first_name, user_name,password from employee where user_name = '" + user + "';";
		
		Connection con =ConnectionDetails.getConncetion();
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		String DBuserName = null;
		String DBpassword = null;
		String fname=null;
		while (rs.next()) {
			fname = rs.getString(1);
			DBuserName = rs.getString(2);
			DBpassword= rs.getString(3);
		}

		if(DBuserName.equals(user) && DBpassword.equals(pass))
		{
			return fname;
		}
		
		return null;
	}
}
