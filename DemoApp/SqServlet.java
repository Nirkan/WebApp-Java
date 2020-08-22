package com.kandpal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;


@WebServlet("/sq")
public class SqServlet extends HttpServlet
{
	
	private static final int Int = 0;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		// int k = (int) req.getAttribute("k");
		
		//int k = Integer.parseInt(req.getParameter("k"));
		
		//HttpSession session = req.getSession();
		
		//int k = (int)session.getAttribute("k");
		
		int k = 0;
		
	   javax.servlet.http.Cookie[] cookies =  req.getCookies();
		
		for(javax.servlet.http.Cookie c : cookies)
		{
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		k =   k *  k;
		
		PrintWriter out = res.getWriter();
		
		out.println("Result is " + k);
	
		//System.out.println("sq called");
	
	
	}

}
