package officeweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet(urlPatterns = { "/home" }, initParams = { @WebInitParam(name = "count", value = "100") })
@WebInitParam(name="message",value="hello")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int count;

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
		//count = Integer.parseInt(getInitParameter("count"));
		count = Integer.parseInt(config.getInitParameter("count"));
		System.out.println(count
				+ "  during initialization");
		
		//System.out.println(config.getServletContext().getInitParameter("message"));   

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Destroy method at the end");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String message = "in doGet method : count is + " + count;

		PrintWriter writer = response.getWriter();
        String initMessage = getServletContext().getInitParameter("message");
		writer.write(message);  
		
		count = count + 1;       
		
		writer.write("servlet context parameter value " + initMessage);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String message = "in doPost method : count is + " + count;

		PrintWriter writer = response.getWriter();

		writer.write(message);

		count = count + 1;
	}

}
