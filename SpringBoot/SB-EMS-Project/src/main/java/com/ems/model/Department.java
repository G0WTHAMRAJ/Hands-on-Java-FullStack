package com.ems.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "dept")
public class Department {

	@Id
	@Column(name = "depid")
	private int deptId;

	@Column(name = "depname")
	private String deptName;

	@OneToMany(mappedBy = "dept")
	//private List<Employee> employee = new ArrayList<Employee>();

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int dept_id) {
		this.deptId = dept_id;
	}

	public String getDeptName() {
		return deptName;
	}

//	public List<Employee> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(List<Employee> employee) {
//		this.employee = employee;
//	}
//
	public void setDeptName(String dept_name) {
		this.deptName = dept_name;
	}

}
