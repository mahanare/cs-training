package com.officeweb.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter  {

	@Override
	public void destroy() {
	

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain arg2) throws IOException, ServletException {
		System.out.println("withiin the login filter");
		
	   HttpServletRequest httpRequest = (HttpServletRequest) request;
	   String userName =(String)httpRequest.getSession().getAttribute("username");
	   
	   System.out.println(httpRequest.getServletPath());;
	   
	   if(userName == null &&  (httpRequest.getSession().getAttribute("loginfailed") == null)){
		   System.out.println("no valid session, redirecting to login page");
		   httpRequest.getSession().setAttribute("loginfailed",true);		   
		   HttpServletResponse httpResponse = (HttpServletResponse) response;		   
		   httpResponse.sendRedirect("/officeweb/login");
	   }
		

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		

	}

}
