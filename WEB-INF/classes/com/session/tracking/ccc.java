package com.session.tracking;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class ccc extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			HttpSession ss=request.getSession();
			String name=(String)ss.getAttribute("name"); // what we are passing inside String is of type Object hence need to typecaste it to String in our example
			String city=(String)ss.getAttribute("city");
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
			pw.println("<form action='/SessionTracking4/index.html'>");
			pw.println("<button type='submit'>Ok</button>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}