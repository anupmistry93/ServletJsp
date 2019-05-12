package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet2 extends HttpServlet {
	
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		
		int num=0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k")){
			num = Integer.parseInt(c.getValue());
			}
		}
		
         num= num*num ;
        
		PrintWriter out =  res.getWriter();
		out.println( "square value is =  "+ num);
		
		
		 // servlet context
	    ServletContext ctx = getServletContext();
	    String str = ctx.getInitParameter("name");
	   // PrintWriter out =  res.getWriter();
		out.println( "name from servletcontext: "+ str);
		
		
		// servlet config
	    ServletConfig cfg = getServletConfig();
	    String str1 = cfg.getInitParameter("name");
	   // PrintWriter out =  res.getWriter();
		out.println( "name from servletconfig: "+ str1);
		
	}


}
