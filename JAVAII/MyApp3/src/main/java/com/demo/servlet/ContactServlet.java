package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		out.println("<h2> you can contact us on 02400522522</h2>\r\n"
				+ "<a href=\"./index.html\" alt=\"back\"> &larr;back</a>");
	}
}
