package com.revature.servlets;

import java.io.IOException;
import java.io.Reader;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EchoServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		
		// Use a buffer to read from the 
		Reader reader = request.getReader();
		char[] buffer = new char[5];
		int valuesRead = 0;
		String input = "";
		
		while((valuesRead = reader.read(buffer)) != -1) {
			// Don't append parts of string leftover from previous buffer
			input += new String(buffer).substring(0, valuesRead);
		}
		
		// echo request body to response
		response.getWriter().write(input);
		
	}
}
