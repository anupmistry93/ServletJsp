package com.jsp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class Servlet2 extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		
		 HttpSession session = req.getSession();
		 
		 int k= (int) session.getAttribute("k");
		 
		 k=k*k;
       
		PrintWriter out =  res.getWriter();
		out.println( "squared number  is: "+ k);
		
	
		
	

		
	}


}
