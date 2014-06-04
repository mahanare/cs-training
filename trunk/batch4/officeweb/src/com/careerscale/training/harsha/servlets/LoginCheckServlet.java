package com.careerscale.training.harsha.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerscale.training.harsha.db.LoginDB;

/**
 * Servlet implementation class LoginCheckServlet
 */
public class LoginCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheckServlet() {
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
		LoginDB login = new LoginDB();
		String user = request.getParameter("userNameTbx");
		String pass = request.getParameter("passwordTbx");
		PrintWriter out = response.getWriter();
		
		try {
			String fname = login.loginAuthentication(user, pass);
			
			if(fname!=null)
			{
				
				out.write("<h2> Hi " + fname + "! You have successfully logged in.</h2>");
				
			}
			else
			{
				response.sendRedirect("http://localhost:8080/officeweb/harsha/Login.html");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
