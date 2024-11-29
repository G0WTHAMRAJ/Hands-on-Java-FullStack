package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Department;

import com.ems.repo.DepartmentRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class DepartmentController {

	@Autowired
	private DepartmentRepo drepo;

	public DepartmentController(DepartmentRepo drepo) {
		this.drepo = drepo;
	}

	@PostMapping("/insert-department")
	public void doInsert(@RequestBody Department department) {
		drepo.save(department);
	}
}
