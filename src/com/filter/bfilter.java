package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/first")
public class bfilter implements Filter
{

	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		boolean flag=true;
		String name_error="",roll_no_error="",addr_error="";
		
		String n =request.getParameter("name");
		String r = request.getParameter("roll_no");
		String a = request.getParameter("addr");
		PrintWriter out = response.getWriter();
		if(n.equals("")||n==null)
		{
			name_error="name is required";
			flag=false;
		} 
		if (r.equals("")|| r==null)
		{
			roll_no_error="roll no required";
			flag=false;
		}
		if(a.equals("")||a==null)
		{
			addr_error="address is required";
			flag=false;
		}	
			
		if(flag==true)
		{
			chain.doFilter(request, response);
		}
		
		
		else
		{
			
		out.println("<html><body><h1>Enter Details of yours </h2>");
		out.println("<form action='first'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td> name </td>");
		out.println("<td><input type='text' name='name' value='"+n+"'/></td>");
		out.println("<td><font color='red' size='4'><b>"+name_error+"</b></font></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Roll No </td>");
		out.println("<td><input type='text' name='roll_no' value='"+r+"'/></td>");
		out.println("<td><font color='red' size='4'><b>"+roll_no_error+"</b></font></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> address </td>");
		out.println("<td><input type='text' name='addr' value='"+a+"'/></td>");
		out.println("<td><font color='red' size='4'><b>"+addr_error+"</b></font></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='submit' value='submit'/></td></tr>");
		out.println("</table></form></body></html>");
		}
					
		
		
	}

	
}


