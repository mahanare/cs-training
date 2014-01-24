package officeweb.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class CommonDAO {

	public static Map<Integer, String> getDepartments() {

		Map<Integer, String> departments = new HashMap<Integer, String>();
		try {
			Connection con = JDBCConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery("select * from department");
			while (results.next()) {
				departments.put(results.getInt("id"), results.getString("name"));
			}
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
		return departments;
	}

	public static Map<Integer, String> getManagers() {

		Map<Integer, String> managers = new HashMap<Integer, String>();
		try {
			Connection con = JDBCConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery("select id,first_name from employee where manager_id=5");
			while (results.next()) {
				managers.put(results.getInt("id"), results.getString("first_name"));
			}
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
		return managers;
	}

	public static Map<Integer, String> getDesignations() {

		Map<Integer, String> designations = new HashMap<Integer, String>();
		try {
			Connection con = JDBCConnectionManager.getConnection();
			Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery("select * from designation");
			while (results.next()) {
				designations.put(results.getInt(1), results.getString(2));
			}
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
		return designations;
	}

}
