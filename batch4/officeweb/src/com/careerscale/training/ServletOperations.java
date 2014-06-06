package com.careerscale.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletOperations
 */
public class ServletOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOperations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println(config.getInitParameter("testParam"));
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name", "harinath");
		
		response.addCookie(new Cookie("TestCookie", "TestCookieValue"));
		
				
		
		/** writer.write("<h1>Hari test </h1>");
		writer.write("<h1>Hari test </h1>");
		writer.write("<h1>Hari test </h1>");
		response.flushBuffer();
		
		**/
		
		//response.sendRedirect("http://google.com");
		//ServletContext context = getServletContext();
		
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/HelloServlet");  //you can also do /hello.html
		dispatcher.forward(request, response);
		
		//dispatcher.include(request, response);
		
		/**
		writer.write("<h1>Hari test </h1>");
		writer.write("<h1>Hari test </h1>");
		writer.write("<h1>Hari test </h1>");
		writer.write("<h1>Hari test </h1>");
		response.flushBuffer();
		
		**/
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
