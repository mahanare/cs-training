package com.officeweb.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private ServletConfig config;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void init(ServletConfig servletConfig) throws ServletException {
		//testConfigProperty = servletConfig.getInitParameter("testParam");
		//System.out.println(testConfigProperty);
		this.config = servletConfig;
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

			String user =null;
			Cookie[] mycookie = request.getCookies();
			if(mycookie != null){
				
			
		for(int i=0;i<mycookie.length;i++)
		{
			if(mycookie[i].getName() =="username")
			{
		user = mycookie[i].getValue();
		request.setAttribute("user", user);
			}
		}
			}
		user = (String)request.getSession().getAttribute("username");
		System.out.println(user);
		if(user!=null){
			RequestDispatcher dispatcher = config.getServletContext().getRequestDispatcher("/WEB-INF/pages/home.jsp");
			dispatcher.forward(request,response);
		}
		else
		{
		/*	RequestDispatcher dispatcher = config.getServletContext().getRequestDispatcher("/login");
			dispatcher.forward(request,response);
			
		*/	
			System.out.println("redirecting to login page");
			response.sendRedirect("login");
		}
//			RequestDispatcher dispatcher = getServletContext()
//					.getRequestDispatcher("/WEB-INF/pages/home.jsp");
	//
//			dispatcher.forward(request, response);
			//dispatcher.include(request, response);
			
			
		}

	
}

	
	
