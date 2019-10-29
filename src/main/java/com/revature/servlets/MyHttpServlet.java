package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * By default, an HttpServlet's service method is configured to delegate
 * requests to methods based on the Http method the request was sent with.
 * For instance, if a request was a GET request, it will delegate to the
 * doGet(...) method. 
 * 
 * GET  	-> doGet
 * POST 	-> doPost
 * PUT		-> doPut
 * DELETE	-> doDelete
 * 
 * @author Mitch
 *
 * Servlet should only be responsible for handling request and responses
 * directly.
 *
 * Now create your own servlet!
 * Pick a theme and create a servlet around it.
 * Configure it in the web.xml (deployment descriptor)
 * Add a doPost and doGet method which write something to the response.
 * test to make sure it works correctly
 * 
 * 
 *
 */
public class MyHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		System.out.println("get request received");
	}
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post request received");
	}

}













