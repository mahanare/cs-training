package officeweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemoServlet
 */
@WebServlet("/session")
public class SessionDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//if there is an active session associated with this user, it will return it. 
		//otherwise it will create a new session and return.
		HttpSession session = request.getSession(); 
		
		//if there is an active session associated with the user, it will return it. if not it will return null and not create any new session
		
		//request.getSession(false);
		
		//request.getSession(true) is kind of equalant of request.getSession()
		
		//
		
		session.setAttribute("userId", request.getParameter("user"));
		
		PrintWriter writer = response.getWriter();
		writer.write("added userId to session");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
