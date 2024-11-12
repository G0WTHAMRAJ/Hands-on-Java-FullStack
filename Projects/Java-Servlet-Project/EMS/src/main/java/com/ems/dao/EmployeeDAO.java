package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.util.DBUtil;

public class EmployeeDAO {
	public int insertEmployee(Employee employee) {
		int n = 0;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "insert into employee values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getEsalary());
			n = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

public int deleteEmployee(int eid) {
	int n = 0;
	try {
		Connection con = DBUtil.getConnection();
		String sql = "delete from employee where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, eid);
		n = ps.executeUpdate();

	} catch (Exception e) {
		System.out.println(e);
	}
	return n;

}

public int updateEmployee(Employee employee) {
	int n = 0;
	try {
		Connection con = DBUtil.getConnection();
		String sql = "update employee set name=?,salary=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, employee.getEname());
		ps.setInt(2, employee.getEsalary());
		ps.setInt(3, employee.getEid());
		n = ps.executeUpdate();

	} catch (Exception e) {
		System.out.println(e);
	}
	return n;

}

public Employee findEmployee(int eid) {
	Employee emp = null;
	try {
		Connection con = DBUtil.getConnection();
		String sql = "select * from employee where id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, eid);
		ResultSet res = ps.executeQuery();
		if (res.next()) {
			emp = new Employee();
			emp.setEid(res.getInt("id"));
			emp.setEname(res.getString("name"));
			emp.setEsalary(res.getInt("salary"));
		}

	} catch (Exception e) {
		System.out.println(e);
	}
	return emp;

}

public List<Employee> findAllEmployee() {
	List<Employee> list = new LinkedList<>();
	try {
		Connection con = DBUtil.getConnection();
		String sql = "select * from employee ";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet res = ps.executeQuery();
		while (res.next()) {
			Employee emp = new Employee();
			emp.setEid(res.getInt("id"));
			emp.setEname(res.getString("name"));
			emp.setEsalary(res.getInt("salary"));
			list.add(emp);
		}

	} catch (Exception e) {
		System.out.println(e);
	}
	return list;

}
}
