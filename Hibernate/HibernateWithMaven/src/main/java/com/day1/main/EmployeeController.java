package com.day1.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.day1.bean.Employee;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeController {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory(); // each database will produce different so need to store
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();
		/*
		 * Employee empolyee=new Employee(); empolyee.setId(105);
		 * empolyee.setName("preethi"); empolyee.setSalary(400000);
		 * 
		 * session.save(empolyee); System.out.println("Object Saved");
		 */
		// Find method to get single object
		Employee emp = session.get(Employee.class, 101);
		// System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		System.out.println(emp); // we have created string method in bean class

// findAll-
//		Query query = session.createQuery("from Employee where id=:idno");
//		int id=102;
//		query.setParameter("idno", id);
//		List<Employee> list = query.list();
//		Iterator<Employee> it = list.iterator();
//		while (it.hasNext()) {
//			Employee obj = (Employee) it.next();
//			System.out.println(obj.getId() + " " + obj.getName() + " " + obj.getSalary());
//		}
// update method-	
//		int id =101;
//		String name ="Raj";
//		int salary=222;
//		 Query query=session.createQuery("update Employee set name=:name,salary=:salary where id=:id");
//		 query.setParameter("id", id);
//		 query.setParameter("name", name);
//		 query.setParameter("salary", salary);
//		 int n=query.executeUpdate();
//		 
//Delete Query
//		 int id =105;
//		 Query query =session.createQuery("delete from Employee where id=:id");
//		 query.setParameter("id", id);
//		 int n =query.executeUpdate();

//using Alias name Employee obj converting Employee bean into object		
//		int id = 102;
//		Query query = session.createQuery("select obj.id,obj.name from Employee obj where obj.id=:id");
//		query.setParameter("id", id);
//		List list = query.list();
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			Object data[] = (Object[]) it.next();
//			System.out.println(data[0] + " " + data[1]);
//		}

//Criteria Query Language [HCQL] used only for select query
//		 // Step 1: Use CriteriaBuilder to build query
//		HibernateCriteriaBuilder cb = session.getCriteriaBuilder();
//		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
//
//		// Step 2: Define the root entity (Employee)
//		Root<Employee> root = cq.from(Employee.class);
//		
//		// Step 3: Add WHERE condition
//		cq.select(root).where(cb.equal(root.get("id"), 101));
//		
//		// Step 4: Execute query and get results
//		List<Employee> employees = session.createQuery(cq).getResultList();
//
//		for (Employee employee : employees) {
//			System.out.println(employee.getName() + " | " + employee.getSalary());
//		}
		String sql = "SELECT * FROM employee";
		Query query =session.createNativeQuery(sql, Employee.class);
		List<Employee> list = query.getResultList();
		for (Employee e : list) {
			System.out.println(e); }
		

		tn.commit();
		session.close();
	}

}
