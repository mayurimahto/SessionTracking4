package com.session.tracking;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.net.*;

public class bbb extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			String name=request.getParameter("name");
			String city=request.getParameter("city");
			Cookie c1=new Cookie("name", URLEncoder.encode(name));
			response.addCookie(c1);
			Cookie c2=new Cookie("city", URLEncoder.encode(city));
			response.addCookie(c2);
			System.out.println("Data Arrived");
			System.out.println("Name : "+name);
			System.out.println("City : "+city);
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");

			pw.println("<!DOCTYPE HTML>");
			pw.println("<html lang='en'>");
			pw.println("<head>");
			pw.println("<meta charset='utf-8'>");
			pw.println("<title>Session Tracking using HttpSession Object</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("Data Saved<br>");
			pw.println("Name : "+name+"<br>");
			pw.println("City : "+city+"<br>");
			
			pw.println("<a href='/SessionTracking4/ccc'>Save</a>");

			pw.println("</body>");
			pw.println("</html>");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}