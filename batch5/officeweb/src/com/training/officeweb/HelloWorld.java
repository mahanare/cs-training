package com.training.officeweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		PrintWriter writer = response.getWriter();
		writer.write("<h2>hello world </h2>");
		writer.write("<h2>hello world </h2>");
		writer.write("<h2>hello world </h2>");
		writer.write("<h2>hello world </h2>");
		writer.write("<h2>hello world </h2>");
		writer.write("<h1>hello world </h2>");
		writer.write("<h2>hello world </h2>");
		writer.write("<h2>hello world </h2>");
		writer.write("<h2>hello world </h2>");
		writer.write(" " + name);
		writer.write(request.getParameter("age"));
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
