package com.careerscale.training;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerscale.training.dao.CommonDAO;
import com.careerscale.training.dao.RegisterDAO;
import com.careerscale.training.model.User;



/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		populateData(request);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/pages/register.jsp");
		dispatcher.forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmpassword");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String departmentId = request.getParameter("department");
		String designationId = request.getParameter("designation");
		String managerid= request.getParameter("managerid");
//		if (!password.equals(confirmPassword)) {
//			// throw error and respond with same register.jsp with values
//			populateData(request);
//			request.setAttribute("error","Password and  Confirm Password are not same. Please try again");
//			RequestDispatcher dispatcher = getServletContext()
//					.getRequestDispatcher("/WEB-INF/pages/register.jsp");
//			dispatcher.forward(request, response);
//		}
		User user = new User(email , password, firstName, lastName, getDateFromString(dob),
				departmentId, designationId,userName,managerid );
	  

		try {
			RegisterDAO dao = new RegisterDAO();
			dao.register(user);
			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/WEB-INF/pages/home.jsp");
			
			
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			// show error on page
			populateData(request);
			request.setAttribute("error", e.getMessage());
			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/WEB-INF/pages/register.jsp");
			dispatcher.forward(request, response);

		}

	}
	
	private Date getDateFromString(String dateString) {
		java.sql.Date dob = null;
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try{
			dob =new java.sql.Date(format.parse(dateString).getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
		return dob; 
		
		
	}

	
	private void populateData(HttpServletRequest request){
		request.setAttribute("departments", CommonDAO.getDepartments());
		request.setAttribute("designations", CommonDAO.getDesignations());
		request.setAttribute("managers", CommonDAO.getManagers());
	}

}
