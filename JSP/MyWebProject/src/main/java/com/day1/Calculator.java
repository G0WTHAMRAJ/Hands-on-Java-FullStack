package com.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculator")
public class Calculator extends HttpServlet {


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1=Integer.parseInt(request.getParameter("n1"));
		int n2=Integer.parseInt(request.getParameter("n2"));
		String triggerFrom=request.getParameter("btn");
		PrintWriter out=response.getWriter();
		if(triggerFrom.equals("addition")) {
			RequestDispatcher rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<font color='green'><b>"+(n1+n1)+"</b></font>");
		}
		if(triggerFrom.equals("subraction")) {
			RequestDispatcher rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<font color='green'><b>"+(n1-n1)+"</b></font>");
		}
		if(triggerFrom.equals("multiplication")) {
			RequestDispatcher rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<font color='green'><b>"+(n1*n1)+"</b></font>");
		}
		if(triggerFrom.equals("division")) {
			RequestDispatcher rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<font color='green'><b>"+(n1/n1)+"</b></font>");
		}
			
	}

}
