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
			Cookie cookies[]=request.getCookies();
			String name="";
			String city="";
			if(cookies!=null)
			{
				Cookie c;
				int x;
				for(x=0;x<cookies.length;x++)
				{
					c=cookies[x];
					if(c.getName().equals("name"))
					{
						name=c.getValue();
						break;
					}
				}
				for(x=0;x<cookies.length;x++)
				{
					c=cookies[x];
					if(c.getName().equals("city"))
					{
						city=c.getValue();
						break;
					}
				}
			}
			System.out.println("Data Arrived");
			System.out.println("Name : "+name);
			System.out.println("City : "+city);
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");

			pw.println("<!DOCTYPE HTML>");
			pw.println("<html lang='en'>");
			pw.println("<head>");
			pw.println("<meta charset='utf-8'>");
			pw.println("<title>Session Tracking using URL Cookies</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("Data Saved<br>");
			pw.println("Name : "+name+"<br>");
			pw.println("City : "+city+"<br>");
			pw.println("<form action='/SessionTracking3/index.html'>");
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