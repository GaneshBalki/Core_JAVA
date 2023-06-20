package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		out.println("<html>\r\n"
				+ "<head>\r\n"
				+ " \r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1>Hello world!</h1>\r\n"
				+ "<form>\r\n"
				+ "    <label for=\"nm\">Name: </label>\r\n"
				+ "    <input type=\"text\" name=\"nm\" id=\"nm\"><br>\r\n"
				+ "    <label for=\"em\">email: </label>\r\n"
				+ "    <input type=\"text\" name=\"em\" id=\"em\"><br>\r\n"
				+ "   <label for=\"addr\">adress: </label>\r\n"
				+ "    <input type=\"text\" name=\"addr\" id=\"addr\"> <br>\r\n"
				+ "    <input type=\"submit\" value=\"submit\"/>\r\n"
				+ "   </form>\r\n"
				+ "   <a h\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}
}
