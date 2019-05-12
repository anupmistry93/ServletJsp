package com.webApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet2 extends HttpServlet {
	
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{   //service, doPut
		
        int num = (int) req.getAttribute("key");
		
        num= num*num ;
        
		PrintWriter out =  res.getWriter();
		out.println( "square is: "+ num);
		
		
		
	}

}
