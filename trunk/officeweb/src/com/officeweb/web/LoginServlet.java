package com.officeweb.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.officeweb.dao.LoginDAO;

/**
 * Servlet implementation class AnotherServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
	private String testConfigProperty;

	public LoginServlet() {
		super();

	}

	public void init(ServletConfig servletConfig) throws ServletException {
		testConfigProperty = servletConfig.getInitParameter("testParam");
		System.out.println(testConfigProperty);
		this.config = servletConfig;
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = config.getServletContext().getRequestDispatcher("/WEB-INF/pages/login.jsp");
		dispatcher.forward(request,response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(userName);
		System.out.println(password);
		LoginDAO loginDao = new LoginDAO();
		boolean result = false;
		try {
			result = loginDao.login(userName, password);
		} catch (Exception e) {

			e.printStackTrace();
		}

		if (result ==true) {
			
			//writer.write("Your login status is " + result);
			//writer.flush();
			ServletContext context = config.getServletContext();
			RequestDispatcher dispatcher = context
					.getRequestDispatcher("/home");
			
			/**Session can be tracked using cookies. 
			 * 
			 */
/*			Cookie cookie = new Cookie("applicationName", "officeweb");
			Cookie userCookie = new Cookie("username", userName);
			
			response.addCookie(cookie);
			response.addCookie(userCookie);*/
			
			/**End of cookie setting to response */
			
			
			//Session can be tracked using using Session object.
			HttpSession session = request.getSession();
			session.setAttribute("username",userName);
			
			
			
			
			request.setAttribute("username", userName);
			dispatcher.forward(request, response);
			
		}
		else{
			response.sendRedirect("login.html");
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
