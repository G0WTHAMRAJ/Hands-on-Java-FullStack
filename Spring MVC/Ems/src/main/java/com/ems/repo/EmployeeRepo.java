package com.ems.repo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Repository;

import com.ems.bean.Employee;

@Repository
public class EmployeeRepo {
	private List<Employee> employeeList = new LinkedList<>();

	public boolean insertEmp(Employee emp) {
		return employeeList.add(emp);
	}

	public boolean updateEmp(Employee emp) {
		ListIterator<Employee> iterator = employeeList.listIterator();
		boolean flag = false;

		while (iterator.hasNext()) {
			Employee e = iterator.next();
			if (e.getEid() == emp.getEid()) {
				employeeList.remove(e);
				employeeList.add(emp);
				flag = true;
			}

			else {
				flag = false;
			}
		}
		return flag;

	}

	public boolean deleteEmp(Employee emp) {
		ListIterator<Employee> iterator = employeeList.listIterator();
		boolean flag = false;

		while (iterator.hasNext()) {
			Employee e = iterator.next();
			if (e.getEid() == emp.getEid()) {
				employeeList.remove(e);
				flag = true;
			}

			else {
				flag = false;
			}
		}
		return flag;
	}

	public Employee findEmp(int eid) {
		ListIterator<Employee> iterator = employeeList.listIterator();
		Employee emp = null;

		while (iterator.hasNext()) {
			Employee e = iterator.next();
			if (e.getEid() == eid) {
				emp = e;
				break;
			}

		}
		return emp;
	}

	public List<Employee> findAllEmp(){
		return employeeList;
	}

}
