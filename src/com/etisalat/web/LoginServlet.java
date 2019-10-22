package com.etisalat.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");
			if (userid.equals("admin") && password.equals("admin@123")) {
				out.println("<html><body><h1>" + "Welcome to Main menu" + "</h1></body></html>");
			} else {
				out.println("<html><body><h1>" + "Invalid credentials!" + "</h1></body></html>");
				out.println("<a href='home.jsp'>" + "Login" + "</a>");
			}

		} catch (Exception e) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND, e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
