package com.cms.main;

import java.util.List;
import java.util.Scanner;

import com.cms.bean.Customer;
import com.cms.dao.CustomerDAO;


public class CMS {

	

		static Scanner sc = new Scanner(System.in);
		static CustomerDAO dao = new CustomerDAO();

		public static int menu() {
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Update");
			System.out.println("4.Find");
			System.out.println("5.Find All");
			System.out.println("6.Exit");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			return choice;

		}

		public static Customer insertCustomer() {
			System.out.println("Enter Customer  id, name ,account number and balance");
			return new Customer(sc.nextInt(), sc.next(),sc.next(),sc.nextInt());// inserting the data and returning

		}

		public static int deleteCustomer() {
			System.out.println("Enter Customer  id");
			return sc.nextInt();

		}

		public static Customer updateCustomer() {
			System.out.println("Enter Customer  Id,Name,Account Number and Balance");
			return new Customer(sc.nextInt(), sc.next(),sc.next(), sc.nextInt());
		}

		public static int findCustomer() {
			System.out.println("Enter Customer id");
			return sc.nextInt();

		}

		public static void main(String[] args) { // view -main class
			String msg = "";
			int n = 0;
			do {
				switch (CMS.menu()) { // controller -Switch Case
				case 1:
					Customer customer = insertCustomer();
					n = dao.insertCustomer(customer);
					if (n == 1)
						System.out.println("Record Inserted");
					else
						System.out.println("Record Not Inserted");
					break;
				case 2:
					int cid = deleteCustomer();
					n = dao.deleteCustomer(cid);
					if (n == 1)
						System.out.println("Record Deleted");
					else
						System.out.println("Record Not Deleted");

					break;
				case 3:
					Customer customer1 = updateCustomer();
					n = dao.updateCustomer(customer1);
					if (n == 1)
						System.out.println("Record updated");
					else
						System.out.println("Record Not updated");
					break;
				case 4:
					int cid1 = findCustomer();
					Customer temp = dao.findCustomer(cid1);
					if (temp == null)
						System.out.println("Customer not found");
					else {
						System.out.println("Customer ID : "+temp.getCid() + "||" +"Customer Name : "+ temp.getCname()+"||"+"Customer AccountNo : "+temp.getCaccount() + "||" + "Customer Balance : "+ temp.getCbalance());
					}
					break;
				case 5:
					List<Customer> list = dao.findAllCustomer();
					for (Customer e : list)
						System.out.println("Customer ID : "+e.getCid() + "||" + "Customer Name : "+e.getCname() + "||" +"Customer AccountNo : "+e.getCaccount()+"||"+ "Customer Balance : "+e.getCbalance());
					break;
				case 6:
					System.exit(0);
					break;
				}
				System.out.println("Do You want continue [Yes|No]");
				msg = sc.next();
			} while (msg.equalsIgnoreCase("yes"));

		}

	}

