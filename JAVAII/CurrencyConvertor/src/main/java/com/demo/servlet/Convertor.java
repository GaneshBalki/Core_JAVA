package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Convertor extends HttpServlet
{  
	float num1,num2;
	
	
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	res.setContentType("text/html");
    	PrintWriter out = res.getWriter(); 
    	String box1=req.getParameter("num1");
    	String box2=req.getParameter("num2");
    	
    	out.println("<!DOCTYPE html>\r\n"
    			+ "<html>\r\n"
    			+ "<head>\r\n"
    			+ "<meta charset=\"ISO-8859-1\">\r\n"
    			+ "<title>Currency Convertor</title>\r\n"
    			+ "\r\n"
    			+ "</head>\r\n"
    			+ "<body>\r\n"
    			+ "	<form action=\"convertor\" method=\"get\" style=\"margin-top: 100px;margin-bottom: 20px;\">\r\n"
    			+ "		<table>\r\n"
    			+ "		\r\n"
    			+ "				<tr>\r\n"
    			+ "					<td style=\"width: fit-content;\"><select name=\"from\"\r\n"
    			+ "						style=\"width: 190px;\">\r\n"
    			+ "							<option value=\"\">Select</option>\r\n"
    			+ "							<option value=\"INR\">Rupee</option>\r\n"
    			+ "							<option value=\"DLR\">Dollar</option>\r\n"
    			+ "							<option value=\"EUR\">Euro</option>\r\n"
    			+ "					</select></td>\r\n"
    			+ "					<td style=\"width: fit-content;\"><select name=\"to\"\r\n"
    			+ "						style=\"width: 190px;\">\r\n"
    			+ "							<option value=\"\">Select</option>\r\n"
    			+ "							<option value=\"INR\">Rupee</option>\r\n"
    			+ "							<option value=\"DLR\">Dollar</option>\r\n"
    			+ "							<option value=\"EUR\">Euro</option>\r\n"
    			+ "					</select></td>\r\n"
    			+ "				</tr>");
    	
    	String from=req.getParameter("from");
    	String to=req.getParameter("to");
    	if(box2.equals("")) {
    		
    		switch(from) {
    		case "INR":
    			  switch(to) {
    			  case "INR":
    				  num1=Float.parseFloat(req.getParameter("num1"));
    				  break;
    			  case "DLR":
    				  num1=Float.parseFloat(req.getParameter("num1"))/82;
    				  break;
    			  case "EUR":
    				  num1=Float.parseFloat(req.getParameter("num1"))/91;
    				  break;
    			  }
    			break;
    		case "DLR":
  			  switch(to) {
  			  case "DLR":
  				  num1=Float.parseFloat(req.getParameter("num1"));
  				  break;
  			  case "INR":
  				  num1=Float.parseFloat(req.getParameter("num1"))*82;
  				  break;
  			  case "EUR":
  				  num1=Float.parseFloat(req.getParameter("num1"))*0.92f;
  				  break;
  			  }
  			break;
    		case "EUR":
  			  switch(to) {
  			  case "EUR":
  				  num1=Float.parseFloat(req.getParameter("num1"));
  				  break;
  			  case "DLR":
  				  num1=Float.parseFloat(req.getParameter("num1"))*1.09f;
  				  break;
  			  case "INR":
  				  num1=Float.parseFloat(req.getParameter("num1"))*91;
  				  break;
  			  }
  			break;
    		}
    		
    		out.println("<tr>\r\n"
    				+ "					<td style=\"width: fit-content;\"><input type=\"text\" name=\"num1\"\r\n"
    				+ "						id=\"n1\" style=\"width: 183px;\" value='"+box1+"' /></td>\r\n"
    				+ "					<td style=\"width: fit-content;\"><input type=\"text\" name=\"num2\"\r\n"
    				+ "						id=\"n2\" style=\"width: 183px;\"  value='"+num1+"' /></td>\r\n"
    				+ "				</tr>");
    		
    	}else {
    		num2=Float.parseFloat(req.getParameter("num2"));
    		
    		switch(to) {
    		case "INR":
    			  switch(from) {
    			  case "INR":
    				  num1=Float.parseFloat(req.getParameter("num2"));
    				  break;
    			  case "DLR":
    				  num1=Float.parseFloat(req.getParameter("num2"))/82;
    				  break;
    			  case "EUR":
    				  num1=Float.parseFloat(req.getParameter("num2"))/91;
    				  break;
    			  }
    			break;
    		case "DLR":
  			  switch(from) {
  			  case "DLR":
  				  num1=Float.parseFloat(req.getParameter("num2"));
  				  break;
  			  case "INR":
  				  num1=Float.parseFloat(req.getParameter("num2"))*82;
  				  break;
  			  case "EUR":
  				  num1=Float.parseFloat(req.getParameter("num2"))*0.92f;
  				  break;
  			  }
  			break;
    		case "EUR":
  			  switch(from) {
  			  case "EUR":
  				  num1=Float.parseFloat(req.getParameter("num2"));
  				  break;
  			  case "DLR":
  				  num1=Float.parseFloat(req.getParameter("num2"))*1.09f;
  				  break;
  			  case "INR":
  				  num1=Float.parseFloat(req.getParameter("num2"))*91;
  				  break;
  			  }
  			break;
    		}
    		
    		out.println("<tr>\r\n"
    				+ "					<td style=\"width: fit-content;\"><input type=\"text\" name=\"num1\"\r\n"
    				+ "						id=\"n1\" style=\"width: 183px;\" value='"+num1+"' /></td>\r\n"
    				+ "					<td style=\"width: fit-content;\"><input type=\"text\" name=\"num2\"\r\n"
    				+ "						id=\"n2\" style=\"width: 183px;\"  value='"+box2+"' /></td>\r\n"
    				+ "				</tr>");
    	}
       out.println("</table>\r\n"
       		+ "<button type=\"submit\" name=\"btn\" id=\"b1\" style=\"width: 388px;\">Convert</button>\r\n"
       		+ "\r\n"
       		+ "	</form>\r\n"
       		+ "</body>\r\n"
       		+ "</html>");
    }
}
