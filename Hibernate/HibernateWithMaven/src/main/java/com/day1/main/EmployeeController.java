package com.day1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.day1.bean.Employee;

public class EmployeeController {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory =config.buildSessionFactory(); //each database will produce different so need to store
		Session session =factory.openSession();
		Transaction tn =session.beginTransaction();
	    /*Employee empolyee=new Employee();
		empolyee.setId(105);
		empolyee.setName("preethi");
		empolyee.setSalary(400000);
		
		session.save(empolyee);
		System.out.println("Object Saved");
		*/
		//Find method to get single object
		Employee emp =session.get(Employee.class, 101);
	//	System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		System.out.println(emp); //we have created string method in bean class
		
		//findAll
		
		List<Employee> emp=session.createQuery("From ").list();
		
		
		tn.commit();
		session.close();
	}

}
