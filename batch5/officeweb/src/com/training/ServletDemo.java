package com.training;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("Init Parameters :"
				+ config.getInitParameter("name"));
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Servlet destroyed");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletDemo() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get method invoked");

		System.out.println(getServletContext().getContextPath());
		ServletContext context = getServletContext();
		System.out.println(context.getInitParameter("name"));

		response.addCookie(new Cookie("application", "training"));

		request.getSession().setAttribute("sessionTraining",
				"on 10th of Jan 2015");

		response.getWriter().write(
				"<h1> Hello cookies and session values are set </h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Post method invoked");
	}

}
