package officeweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import officeweb.dao.LoginDAO;

/**
 * Servlet implementation class LoginServlet
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
		 String user = request.getParameter("userName");
		 String password = request.getParameter("password");
		 
		 System.out.println(user + "  " +  password);
		 
		 String initMessage = getServletContext().getInitParameter("message");
		 
		 PrintWriter writer = response.getWriter();
		 
		 writer.write("initMessage " + initMessage);
	}
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String user = request.getParameter("userName");
		 String password = request.getParameter("password");
		 
		 LoginDAO dao = new LoginDAO();
		 boolean result= dao.login(user, password);
		 PrintWriter writer = response.getWriter();
		 writer.write("Login status : "+ result);
		 
		 
		 System.out.println(user + "  " +  password);
				 
	}

}
