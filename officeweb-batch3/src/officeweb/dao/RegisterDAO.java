package officeweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import officeweb.model.User;

public class RegisterDAO {
	
    public boolean register(User user) throws SQLException{
    	boolean rs=false;
    	Connection con = JDBCConnectionManager.getConnection();
    	PreparedStatement stmt =con.prepareStatement("insert into employee (email_id, password, first_name,last_name, "+
        "birth_date,designation_id, department_id ,user_name,manager_id) values(?,?,?,?,?,?,?,?,?)");
    	stmt.setString(1, user.getEmailId());
    	stmt.setString(2, user.getPassword());
    	stmt.setString(3, user.getFirstName());
    	stmt.setString(4, user.getLastName());
    	stmt.setDate(5, user.getDob());
    	stmt.setString(6, user.getDesignationId());
    	stmt.setString(7, user.getDepartmentId());
    	stmt.setString(8, user.getUserName());
    	stmt.setString(9, user.getManagerid());
    	
    	rs=stmt.execute();
    	return rs;
    }
    /*public static void main(String[] args) throws SQLException {
		User user = new User("hari", "test1",  "DFDF", "DFDF", "DFDFD", "DFDSFDFD", "DFD","state");
		RegisterDAO dao = new  RegisterDAO();
		dao.register(user);
		
	}
	*/
}