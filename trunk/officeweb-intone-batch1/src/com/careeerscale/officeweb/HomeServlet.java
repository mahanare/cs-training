package com.careeerscale.officeweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet(urlPatterns = { "/home" }, initParams = {
		@WebInitParam(name = "message", value = "Hello World"),
		@WebInitParam(name = "message1", value = "Hello World1") })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Within init method of HomeServlet");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Within destroy method of HomeServlet");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.write(getInitParameter("message"));

		int count = 0;
		if (getServletContext().getAttribute("count") != null) {
			count = (Integer) getServletContext().getAttribute("count");
			writer.write("  count from context is " + count);
			count++;
		}

		getServletContext().setAttribute("count", count++);

		Cookie[] cookies = request.getCookies();

		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "  " + cookie.getValue());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
