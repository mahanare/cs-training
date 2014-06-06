package com.careerscale.training;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter.
 * 
 * To read more about listerners, read the documentation at
 * 1. http://docs.oracle.com/cd/B14099_19/web.1012/b14017/filters.htm#i1000654
 * 2. http://www.mkyong.com/servlet/a-simple-httpsessionlistener-example-active-sessions-counter/
 */
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest servletRequest = (HttpServletRequest)request;
		HttpSession session = servletRequest.getSession();
		String url =servletRequest.getRequestURL().toString();
		if(url.contains("login") || url.contains("register")){
			chain.doFilter(request, response);
		}
		else if(session.getAttribute("username") == null)
		{
			HttpServletResponse servletResponse = (HttpServletResponse) response;
			request.getServletContext().getRequestDispatcher("/login.html").forward(request, response);
			//servletResponse.sendRedirect("/login.jsp");
		}
		// pass the request along the filter chain
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
