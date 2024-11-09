package com.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/LoginService")
public class LoginService extends HttpServlet {

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");

		if (userName.equals("Admin") && password.equals("123")) {
			//RequestDispatcher rd =request.getRequestDispatcher("LoginSuccess.jsp");
			//rd.forward(request, response);
			response.sendRedirect("LoginSuccess.jsp");
		} else {
			//RequestDispatcher rd=request.getRequestDispatcher("loginPage.jsp");
			//rd.include(request, response);
			//out.println("<font color='red'><b>Login failed incorrect password or username</b></font>");
			response.sendRedirect("LoginFail.jsp");
		}
	}

}
