package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayDetails")
public class DisplayCartDetailsServlet extends HttpServlet{

//	TODO:2 	Provide call-back method (called by web container) for HTTP request made using HTTP GET method
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(request, response);
		PrintWriter writer = response.getWriter();
		
		String[] item = request.getParameterValues("bookName");
		
		writer.println("<html><body>");
		writer.println("<table border=1>");
		writer.println("<th>Book Name</th>");
		
		for(String s: item){
			writer.println("<tr>");
			writer.println("<td>"+s+"</td>");
			writer.println("</tr>");
		}
		
		writer.println("</table>");
		writer.println("<html><body>");
	}
	
//	TODO:3	This method should read products selected by web-client from bookCatelogue.html and 
//					display them in tabular format as html response to the web client.	
}









