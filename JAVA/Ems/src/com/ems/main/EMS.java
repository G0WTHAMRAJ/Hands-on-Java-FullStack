package com.ems.main;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

public class EMS {

	static Scanner sc = new Scanner(System.in);
	static EmployeeDAO dao = new EmployeeDAO();

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

	public static Employee insertEmployee() {
		System.out.println("Enter employee  id,name and salary");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt());// inserting the data and returning

	}

	public static int deleteEmployee() {
		System.out.println("Enter employee  id");
		return sc.nextInt();// inserting the data and returning

	}

	public static Employee updateEmployee() {
		System.out.println("Enter employee  id,name and salary");
		return new Employee(sc.nextInt(), sc.next(), sc.nextInt());// inserting the data and returning

	}

	public static int findEmployee() {
		System.out.println("Enter employee  id");
		return sc.nextInt();// inserting the data and returning

	}

	public static void main(String[] args) { // view -main class
		String msg = "";
		int n = 0;
		do {
			switch (EMS.menu()) { // controller -Switch Case
			case 1:
				Employee employee = insertEmployee();
				n = dao.insertEmployee(employee);
				if (n == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;
			case 2:
				int eid = deleteEmployee();
				n = dao.deleteEmployee(eid);
				if (n == 1)
					System.out.println("Record Deleted");
				else
					System.out.println("Record Not Deleted");

				break;
			case 3:
				Employee employee1 = updateEmployee();
				n = dao.updateEmployee(employee1);
				if (n == 1)
					System.out.println("Record updated");
				else
					System.out.println("Record Not updated");
				break;
			case 4:
				int eid1 = findEmployee();
				Employee temp = dao.findEmployee(eid1);
				if (temp == null)
					System.out.println("Employee not found");
				else {
					System.out.println(temp.getEid() + " " + temp.getEname() + " " + temp.getEsalary());
				}
				break;
			case 5:
				List<Employee> list = dao.findAllEmployee();
				for (Employee e : list)
					System.out.println(e.getEid() + " " + e.getEname() + " " + e.getEsalary());
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
