package com.webApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet1 extends  HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{   //service, doPut
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		
		RequestDispatcher rd = req.getRequestDispatcher("square1");
		rd.forward(req, res);
		
		
		
	}

}
