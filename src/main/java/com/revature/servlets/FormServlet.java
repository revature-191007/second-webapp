package com.revature.servlets;

import java.io.IOException;
import java.security.SecureRandom;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Person;

public class FormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		System.out.println("Form submission received");
		// Pull data from form body or query parameters
		// See names in HTML form for parameter names
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Set status 201 (Created), write "Welcome username"
		response.setStatus(201);
		response.getWriter().write("Welcome " + username);
	}
	
	protected void doPut(HttpServletRequest request, 
			HttpServletResponse response) 
			throws IOException, ServletException {
		
		// Jackson utility class for working with JSON
		ObjectMapper om = new ObjectMapper();
		
		Person person = om.readValue(request.getReader(), Person.class);
		
		// Generate random string from secure random bytes
		SecureRandom random = new SecureRandom();
		byte[] buffer = new byte[255];
		random.nextBytes(buffer);
		String signature = new String(buffer);
		person.setGeneratedSignature(signature);
		
		// Write object state into JSON as response
		om.writeValue(response.getWriter(), person);
		
	}
}
