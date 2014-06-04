package com.careerscale.training.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	public boolean login(String username, String pwd) {
		boolean result = false;

		Connection con;
		try {
			con = JDBCConnectionManager.getConnection();

			Statement stmt = con.createStatement();
			String query ="select * from employee where user_name='"
					+ username + "' and password ='" + pwd + "'";
			System.out.println(query);
			ResultSet results = stmt
					.executeQuery(query);
					while (results.next()) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
