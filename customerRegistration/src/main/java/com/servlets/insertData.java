package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String address = request.getParameter("Address");
		String zip = request.getParameter("Zip");
		String state = request.getParameter("State");
		String country = request.getParameter("Country");
		String phone = request.getParameter("Phone");
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");

		Member mb = new Member(firstname, lastname, address, zip, state, country, phone);
		Member mb1 = new Member(username, password);
		databaseConnection db = new databaseConnection();
		String result = db.insert(mb);
		databaseConnection db1 = new databaseConnection();
		String res = db1.insertintoLogin(mb1);
		response.getWriter().println(result);

	}

}