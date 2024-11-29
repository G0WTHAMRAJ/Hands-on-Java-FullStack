package com.ems.service;

import org.springframework.stereotype.Service;


import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;

@Service
public class EmpolyeeService {

	private EmployeeRepo repo;
	
	public EmpolyeeService(EmployeeRepo repo) {
		this.repo=repo;
		
	}
	
	public void doInsert(Employee employee) {
		repo.save(employee);
	}
}
