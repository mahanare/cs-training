package in.training.careerscale.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletOperations
 */
@WebServlet(value = "/operations", initParams={@WebInitParam(name="foo", value="Hello "),@WebInitParam(name="foo2", value="Hello2 ")})
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
		super.init(config);
		System.out.println(config.getInitParameter("foo"));
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// response.sendRedirect("http://google.com");
		HttpSession session =request.getSession(); 
	    session.setAttribute("session value", "swetha");
	    
	    
		PrintWriter writer = response.getWriter();
		writer.write("this is before include statement");
		//response.flushBuffer();
		request.getServletContext().getRequestDispatcher("/hello1")
				.include(request, response);
		writer.write("this is after include statement");
		
		response.addCookie(new Cookie("name"+new Random().nextInt(100), "swetha"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

}
