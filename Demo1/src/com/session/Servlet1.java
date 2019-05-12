package com.session;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	
	
	
	//SendRedirect //session /
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
			
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			int k = i + j;
			
		 
		    HttpSession session = req.getSession();
		    session.setAttribute("k", k);
		    
		    res.sendRedirect("square1");
		    
		     
			
		}

}
