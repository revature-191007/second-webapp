package com.revature.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet (Interface)
 * GenericServlet impelements Servlet
 * HttpServlet extends GenericServlet
 * YourServlet extends HttpServlet
 */

public class HelloServlet extends HttpServlet{
	
	/**
	 * Is the interface defined method for a high level,
	 * generic handler for defining a request handler.
	 * The HttpServlet overrides this method with a default
	 * implementation for conducting convenient Http related
	 * delegation to more specific request handlers. For examples
	 * sake we are overriding it, but in many circumstances you
	 * would not need to.
	 */
	@Override
	public void service(HttpServletRequest request, 
				HttpServletResponse response) {
		
	}
}
