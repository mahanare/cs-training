package com.careerscale.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

import com.careerscale.training.dao.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println("Cookie name :" + cookie.getName() +" :  value " +  cookie.getValue());
		}
		response.getWriter().print("session value for name is :" +session.getAttribute("name"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		LoginDAO dao = new LoginDAO();

		boolean result;
		result = dao.login(userName, password);

		PrintWriter writer = response.getWriter();
		writer.append("the login result is " + result);
		if(result){
			request.getSession().setAttribute("username", userName);
		}

	}

}
