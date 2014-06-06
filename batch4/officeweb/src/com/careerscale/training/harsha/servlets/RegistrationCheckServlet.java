package com.careerscale.training.harsha.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerscale.training.harsha.db.RegistrationDB;

/**
 * Servlet implementation class RegistrationCheckServlet
 */
public class RegistrationCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		int managerID = Integer.parseInt(request.getParameter("manager"));
		int designationID = Integer.parseInt(request.getParameter("designation"));
		int departmentID = Integer.parseInt(request.getParameter("department"));
		
		RegistrationDB newRegistration = new RegistrationDB();
		try {
			int registrationStatus = newRegistration.dynamicInsertIntoEmployee(userName, password, fname, lname, dob, email, managerID, designationID, departmentID);
			
			if(registrationStatus == 1)
			{
				response.sendRedirect("http://localhost:8080/officeweb/harsha/Login.html");
			}
			else
			{
				PrintWriter out = response.getWriter();
				out.write("<h2> Registration Failed <h2/>");
				//Thread.sleep(3000);
				response.sendRedirect("Registration.html");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}/* catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
	}

}
