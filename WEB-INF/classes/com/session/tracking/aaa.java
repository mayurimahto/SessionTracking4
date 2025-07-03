package com.session.tracking;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class aaa extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
		String name=request.getParameter("name");
		System.out.println("Data Arrived");
		System.out.println("Name : "+name);
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");

		pw.println("<!DOCTYPE HTML>");
		pw.println("<html lang='en'>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("<title>Session Tracking using HttpSession Object</title>");
		pw.println("<script>");
		pw.println("function validateForm(frm)");
		pw.println("{");
		pw.println("var cc=frm.city.value.trim();");
		pw.println("if(cc.length==0)");
		pw.println("{");
		pw.println("var ctErrorSection=document.getElementById('ctErrorSection');");
		pw.println("ctErrorSection.innerHTML='Required';");
		pw.println("frm.city.focus();");
		pw.println("return false;");
		pw.println("}");
		pw.println("return true;");
		pw.println("}");
		pw.println("</script>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<form action='/SessionTracking4/bbb' onsubmit='return validateForm(this)'>");
		pw.println("<input type='hidden' name='name' id='name' value='"+name+"'>");
		pw.println("City");
		pw.println("<input type='text' name='city' id='city'>");
		pw.println("<span id='ctErrorSection'></span>");
		pw.println("<br>");
		pw.println("<button type='submit'>Next</button>");
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