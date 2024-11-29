package com.ems.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "empid")
	private int empId;

	@Column(name = "empname", length = 20)
	private String empName;

	@Column(name = "empsalary")
	private int empSalary;

	@Column(name = "depid")
	private int depId;
	
	@ManyToOne
	@JoinColumn(name="depid" ,insertable = false, updatable = false)
	private Department department;

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int id) {
		this.empId = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
}
