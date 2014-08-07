package in.training.careerscale.web;

import in.training.careerscale.dao.RegistrationDAO;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.write("Hello World");
		writer.write("<br/>");
		writer.write("Request parameter  name: " + request.getParameter("name"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		boolean result=false;
		writer.write("Hello World");
		writer.write("<br/>");
		String userName=request.getParameter("userName");
		writer.write("Request parameter  userName: " + userName) ;
		writer.write("<br/>");
		String pwd =request.getParameter("passwd");
		writer.write("Request parameter  password: " + pwd) ;
		
		RegistrationDAO dao = new RegistrationDAO();
		try {
			result =dao.loginWithCredentials(userName, pwd);
			writer.write("Login result is " + result);

		} catch (SQLException e) {
			
			e.printStackTrace();
			writer.write("Login result is " + result);
		}
		
		
		
		
		
	}

}
