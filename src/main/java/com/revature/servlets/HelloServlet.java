package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
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
	 * @throws ServletException 
	 * @throws IOException 
	 */
	@Override
	public void service(HttpServletRequest request, 
				HttpServletResponse response) throws IOException, ServletException {
		/* Request - Contains meta-data about the request and the 
		 * request data. This includes the original request url/uri,
		 * request body, request headers, etc. */
		
		/* Response - Contains data and methods associates with 
		 * writing responses back to the requester.
		 * */
		
		System.out.println(request.getRequestURL());
		System.out.println(request.getRequestURI());
		System.out.println(request.getPathInfo());
		
		response.setStatus(201);
		response.setHeader("my-header", "my-value");
		response.getWriter().write("Hello!");
	}
}
