package com.ems.service;

import com.ems.model.Department;

import com.ems.repo.DepartmentRepo;


public class DepartmentService {
private DepartmentRepo drepo;
	
	public DepartmentService(DepartmentRepo drepo) {
		this.drepo=drepo;
		
	}
	
	public void doInsert(Department department) {
		drepo.save(department);
	}

}
