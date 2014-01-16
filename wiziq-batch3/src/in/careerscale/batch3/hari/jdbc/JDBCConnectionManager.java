package in.careerscale.batch3.hari.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionManager {

	private static final String conString = "jdbc:mysql://localhost:3306/office";
	
    public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(conString, "root", "secret");
    }

}
