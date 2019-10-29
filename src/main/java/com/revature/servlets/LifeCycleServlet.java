package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet lifecycle is the combination of three methods which
 * represent transitions to different lifecycle stages of the servlet.
 * We can override these methods to inject our own functionality in
 * response to these steps.
 * 
 * 1. init - called once when the servlet initializes
 * 		1. Once
 * 		* Servlet initialization is a function of configuration in 
 * 			web.xml.  By default, they initialize when they receive
 * 			their first request. They can be configured to initialize
 * 			at server startup in the deployment descriptor.
 * 2. service - called once for every request
 * 		1. For every request
 * 3. destroy - called once, when the servlet is being destroyed
 *		1. Once
 */
public class LifeCycleServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
}
