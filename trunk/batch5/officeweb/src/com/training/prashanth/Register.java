package com.training.prashanth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String dob = request.getParameter("dob");
		String deptid = request.getParameter("deptid");
		String desigid = request.getParameter("desigid");
		String managerid = request.getParameter("managerid");

		PrintWriter writer = response.getWriter();
		writer.write("<h3> User Name is :" + userName + " Password is :"
				+ password + " firstname is :" + firstname + " lastname is :"
				+ lastname + " dob is :" + dob + " deptid :" + deptid
				+ " desigid is :" + desigid + " managerid is :" + managerid
				+ "</h3>");

	}

}
