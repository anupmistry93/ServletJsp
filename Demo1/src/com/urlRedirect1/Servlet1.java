package com.urlRedirect1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	//SendRedirect //url redirecting 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
	   // res.sendRedirect("square");  //in url we have to pass the value check screen shot ex3
		
		//res.sendRedirect("square?value=5");
	    
	    res.sendRedirect("square?value="+k);
	    

		
		
	}

}
