package com.cms.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.bean.Customer;
import com.cms.dao.CustomerDAO;

;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {

	static CustomerDAO dao = new CustomerDAO();
	int cid;
	String cname;
	String caccount;
	int cbalance;
	int n;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String operation = request.getParameter("btn");
		if (operation.equalsIgnoreCase("insert")) {
			cid = Integer.parseInt(request.getParameter("cid"));
			cname = request.getParameter("cname");
			caccount = request.getParameter("caccount");
			cbalance = Integer.parseInt(request.getParameter("cbalance"));
			Customer cust = new Customer(cid, cname, caccount, cbalance);
			n = dao.insertCustomer(cust);
			if (n == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("FormCms.jsp");
				rd.include(request, response);
				out.println("<br><center><font color='green'>Record Inserted</center></font>");
			} else {
				out.println("<br><font color='red'>Record Not Inserted</font>");
			}
		}
		if (operation.equalsIgnoreCase("update")) {
			cid = Integer.parseInt(request.getParameter("cid"));
			cname = request.getParameter("cname");
			caccount = request.getParameter("caccount");
			cbalance = Integer.parseInt(request.getParameter("cbalance"));
			Customer cust = new Customer(cid, cname,caccount,cbalance);
			n = dao.updateCustomer(cust);
			if (n == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("FormCms.jsp");
				rd.include(request, response);
				out.println("<br><center><font color='green'>Record Updated</center></font>");
			} else {
				out.println("<br><font color='red'>Record Not Updated</font>");
			}
		}
		if (operation.equalsIgnoreCase("delete")) {
			cid = Integer.parseInt(request.getParameter("cid"));
			n = dao.deleteCustomer(cid);
			if (n == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("FormCms.jsp");
				rd.include(request, response);
				out.println("<br><center><font color='red'>Record Deleted</center></font>");
			} else {
				out.println("<br><font color='red'>Record Not Deleted</font>");
			}
		}
		if (operation.equalsIgnoreCase("find")) {
			cid = Integer.parseInt(request.getParameter("cid"));
			Customer customer = dao.findCustomer(cid);
			if (customer == null) {
				RequestDispatcher rd = request.getRequestDispatcher("FormCms.jsp");
				rd.include(request, response);
				out.println("<br><font color='red'>Record Not found</font>");
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("FormCms.jsp");
				rd.include(request, response);
				out.println(
						"<br><center><font color='green'<b> Customer Id : " + customer.getCid() + " || Customer Name : "
								+ customer.getCname() + " || Customer Account No :  " + customer.getCaccount()
								+ " || Customer Balance : " + customer.getCbalance() + "</b></center</font>");

			}

		}
		if (operation.equalsIgnoreCase("findall")) {
			List<Customer> list = dao.findAllCustomer();
			if (list.isEmpty()) {
				System.out.println("Records Not Found");
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("FormCms.jsp");
				rd.include(request, response);
				for (Customer e : list) {
					out.println("<br><center><font color='green'><b> Customer Id : " + e.getCid() + " Customer Name : "
							+ e.getCname() + " Customer Account No :  " + e.getCaccount() + " Customer Balance :  "
							+ e.getCbalance() + "</b></center></font>");
				}

			}

		}

	}

}
