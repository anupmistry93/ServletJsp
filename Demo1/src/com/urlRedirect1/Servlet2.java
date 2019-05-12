package com.urlRedirect1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		
		int num = Integer.parseInt(req.getParameter("value"));
		
         num= num*num ;
        
		PrintWriter out =  res.getWriter();
		out.println( "square is: "+ num);
		
	}

}
