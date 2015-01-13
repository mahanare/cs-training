package com.training.prashanth;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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

		PrintWriter out = response.getWriter();
		out.write("<h3> User Name is :" + userName + " Password is :"
				+ password + " firstname is :" + firstname + " lastname is :"
				+ lastname + " dob is :" + dob + " deptid :" + deptid
				+ " desigid is :" + desigid + " managerid is :" + managerid
				+ "</h3>");
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/office3", "root", "root");

			PreparedStatement ps = con
					.prepareStatement("insert into employee(user_name, password,first_name,last_name, manager_id, dept_id, desig_id) values(?, ?, ?, ?,?, ?,?)");
			ps.setString(1, userName);
			ps.setString(2, password);
			ps.setString(3, firstname);
			ps.setString(4, lastname);
			ps.setString(5, deptid);
			ps.setString(6, desigid);
			ps.setString(7, managerid);
			int i = ps.executeUpdate();
			if (i > 0)
				out.print("You are successfully registered...");

		} catch (Exception e2) {
			System.out.println(e2);
		}

		out.close();

	}

}
