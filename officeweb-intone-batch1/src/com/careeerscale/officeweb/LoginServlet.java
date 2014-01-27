package com.careeerscale.officeweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.careeerscale.officeweb.dao.LoginDAO;

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


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String user = request.getParameter("userName");
		 String password = request.getParameter("password");
		 
		 System.out.println(user + "  " +  password);
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
		 
		 HttpSession session = request.getSession();
		 
		 
		 Integer count = 0;
		 if(session.getAttribute("test") !=null){
			 count = (Integer) session.getAttribute("test") ;
		 }
		count++;
		 session.setAttribute("test", count);
		  
		 Cookie[] cookies =request.getCookies();
		 
		 for (Cookie cookie : cookies) {
			System.out.println(cookie);
		}
		 //session
		 //cookies
		 //url redirection/hidden fields
		 
		 response.addCookie(new Cookie("mykey", "myValue"));
		 System.out.println(user + "  " +  password +  " sesssion count is :" + count);
		 
		 response.sendRedirect("http://google.com");
				 
	}

}
