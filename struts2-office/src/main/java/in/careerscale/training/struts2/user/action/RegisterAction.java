
package in.careerscale.training.struts2.user.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;


public class RegisterAction  { //implements RequestAware, SessionAware
	
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String execute() throws Exception {
		
		
		System.out.println("user form input is :" + firstName + " : " + lastName + " : " + userName + " : " + password);
	
		//connect do db and register/save user.
		return "success";
		
	}

	


}