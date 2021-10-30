package com.simplilearn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username == null | "".equals(username)) {
			response.sendRedirect("invalid.jsp?error=1");
		}
		else if(password == null | "".equals(password)) {
			response.sendRedirect("invalid.jsp?error=2");
		} else {
			if("learneracademy@gmail.com".equals(username) && "12345".equals(password)){
				request.getRequestDispatcher("homepage.jsp").forward(request, response);;
			} else {
				response.sendRedirect("invalid.jsp?error=3");
			}
			
		}
		
	}

}
