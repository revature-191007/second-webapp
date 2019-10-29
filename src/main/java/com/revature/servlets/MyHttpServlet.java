package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * By default, an HttpServlet's service method is configured to delegate
 * requests to methods based on the Http method the request was sent with. For
 * instance, if a request was a GET request, it will delegate to the doGet(...)
 * method.
 * 
 * GET -> doGet POST -> doPost PUT -> doPut DELETE -> doDelete
 * 
 * @author Mitch
 *
 *         Servlet should only be responsible for handling request and responses
 *         directly.
 *
 *         Now create your own servlet! Pick a theme and create a servlet around
 *         it. Configure it in the web.xml (deployment descriptor) Add a doPost
 *         and doGet method which write something to the response. test to make
 *         sure it works correctly
 * 
 * 
 *      Two methods to delegate processing of a request to another service.
 *      1) forwarding - Completely internal process to the application, and
 *      			will simply forward the request to another servlet for handling.
 *      			Forwarding is invisible to the client.
 *      			Forwarding will be faster, as it does not require a round trip.
 *      			Use this if we need a different servlet in our app to handle it.
 *      
 *      2) redirecting - Is a roundtrip to the client which will redirect the 
 *      			clients browser (or other tool) to a new page given a 
 *      			header that contains the location to redirect to.
 *      			Redirecting is visible to the client.
 *      			Redirecting will be slower due to the increased network
 *      			calls.
 *      			Use this when the request should be handled by a completely
 *      			different application or application instance.
 * 
 *
 */
public class MyHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * To define some logic that always needs to take place, you can override
	 * service, but remember to call super.service(...) so that the parent 
	 * implementation can delegate to the appropriate doX method.
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service handler");
		
		// Example of request scope - setting value on request object
		req.setAttribute("username", "Abby");
		
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("get request received");
		System.out.println("Username: " + request.getAttribute("username"));
		response.sendRedirect("http://google.com/search?q=puppies");
		
		// What sendRedirect actually does:
//		response.setHeader("location", "http://google.com");
//		response.setStatus(302);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post request received");
		// forward request handling to the echo servlet
		req.getRequestDispatcher("/echo").forward(req, resp);
	}

}
