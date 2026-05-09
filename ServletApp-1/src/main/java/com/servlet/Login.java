package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Method Call");
		
		resp.getWriter().print("<h1 style=\"color: red; background-color: yellow; text-align: center\">Welcome To Logine</h1>");
		
		req.getRequestDispatcher("login.html").forward(req, resp);
	}
	
	

}
