package com.ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {

		static EmployeeDAO dao = new EmployeeDAO();
		int eid;
		String ename;
		int esalary;
		int n;
	 
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
	 
			PrintWriter out = response.getWriter();
			String operation = request.getParameter("btn");
			if (operation.equalsIgnoreCase("insert")) {
				eid = Integer.parseInt(request.getParameter("eid"));
				ename = request.getParameter("ename");
				esalary = Integer.parseInt(request.getParameter("esalary"));
				Employee emp = new Employee(eid, ename,esalary);
				n = dao.insertEmployee(emp);
				if (n == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
					request.setAttribute("status","Success");
					request.setAttribute("msg","Record Inserted");
					rd.forward(request, response);
					out.println("<br><font color='green'>Record Inserted</font>");
				} else {
					out.println("<br><font color='red'>Record Not Inserted</font>");
				}
			}
			if (operation.equalsIgnoreCase("update")) {
				eid = Integer.parseInt(request.getParameter("eid"));
				ename = request.getParameter("ename");
				esalary = Integer.parseInt(request.getParameter("esalary"));
				Employee emp = new Employee(eid, ename, esalary);
				n = dao.updateEmployee(emp);
				if (n == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("FormEms.jsp");
					rd.include(request, response);
					out.println("<br><font color='green'>Record Updated</font>");
				} else {
					out.println("<br><font color='red'>Record Not Updated</font>");
				}
			}
			if (operation.equalsIgnoreCase("delete")) {
				eid = Integer.parseInt(request.getParameter("eid"));
				n = dao.deleteEmployee(eid);
				if (n == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("FormEms.jsp");
					rd.include(request, response);
					out.println("<br><font color='green'>Record Deleted</font>");
				} else {
					out.println("<br><font color='red'>Record Not Deleted</font>");
				}
			}
			if(operation.equalsIgnoreCase("find")) {
				eid = Integer.parseInt(request.getParameter("eid"));
				Employee employee = dao.findEmployee(eid);
				if (employee == null) {
					RequestDispatcher rd = request.getRequestDispatcher("FormEms.jsp");
					rd.include(request, response);
					out.println("<br><font color='red'>Record Not found</font>");
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("FormEms.jsp");
					rd.include(request, response);
					out.println("<br><font color='green'><b>"+employee.getEid() + " " + employee.getEname() + " " + employee.getEsalary()+"<b></font>");
	 
				}
				
			}
			if(operation.equalsIgnoreCase("findall")) {
				List<Employee> list = dao.findAllEmployee();
				if (list.isEmpty()) {
					System.out.println("Records Not Found");
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("FormEms.jsp");
					rd.include(request, response);
					for (Employee e : list) {
						out.println("<br><font color='green'><b>"+e.getEid() + " " + e.getEname() + " " + e.getEsalary()+"<b></font>");
	 
						out.println();
					}
				}
			}
	 
		}
}
