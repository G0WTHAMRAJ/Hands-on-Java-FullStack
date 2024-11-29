package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Department;

import com.ems.repo.DepartmentRepo;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "http://localhost:3000/")
public class DepartmentContoller {

	@Autowired
	private DepartmentRepo repo;

	public DepartmentContoller(DepartmentRepo repo) {
		this.repo = repo;
	}

	@PostMapping("/create-department")
	public void doInsert(@RequestBody Department department) {
		repo.save(department);
	}

	@PutMapping("/update-department")
	public void doUpdate(@RequestBody Department employee) {
		repo.save(employee);

	}

	@DeleteMapping("/delete-department/{depId}")
	public void doDelete(@PathVariable("depId") int empId) {
		repo.deleteById(empId);

	}

	@GetMapping("/find-department/{empId}")
	public Department doFind(@PathVariable("depId") int depId) {
		return repo.findById(depId).get();
	}

	@GetMapping("/findAll-department")
	public List<Department> doFindAll() {
		return (List<Department>) repo.findAll();
	}

	@GetMapping("/get-department")
	public String getDepartment() {
		return "data from department";
		
	}

	@GetMapping("/get-department-details/{depId}")
	public String getDepartmentDetails(@PathVariable("depId")int depId){
		Department department=repo.findById(depId);
		return department;
	
	}
}

	
	

