package com.training.officeweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.officeweb.dao.OfficeDAO;

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

		Cookie[] cookies = request.getCookies();

		for (Cookie cookie : cookies) {

			System.out.println(cookie.getName() + " value : "
					+ cookie.getValue());
		}
		HttpSession session = request.getSession();
		System.out.println((String) session.getAttribute("sessionTraining"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		PrintWriter writer = response.getWriter();
		writer.write("<h3> User Name is :" + userName + " Password is :"
				+ password + "</h3>");

		OfficeDAO dao = new OfficeDAO();
		boolean result = dao.login(userName, password);
		writer.write("<h2>Login status is :" + result + "  </h2>");

	}

}
