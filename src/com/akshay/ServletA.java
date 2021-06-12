package com.akshay;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class ServletA extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		
		
		String n =request.getParameter("name");
		String r = request.getParameter("roll_no");
		String a = request.getParameter("addr");
		PrintWriter out = response.getWriter();
		
		out.println("<html> <body><h1>Filled data is </h2><table border ='1'>");
		out.println("<tr><td>name</td><td>"+n+"</td></tr>");
		
		out.println("<tr><td>roll_no</td><td>"+r+"</td></tr>");
		out.println("<tr><td>addr</td><td>"+a+"</td></tr>");
		out.println("</table></body></html>");
		
	}

}



