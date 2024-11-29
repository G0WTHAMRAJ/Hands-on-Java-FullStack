package com.dms.controller;

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

import com.dms.model.Department;
import com.dms.repo.DepartmentRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
//@CrossOrigin(origins = "http://localhost:3000/")
public class DepartmentController {
	private DepartmentRepo repo;
	@Autowired
	public DepartmentController(DepartmentRepo repo) {
	this.repo= repo;
	}

	@PostMapping("/create-department")
	// @RequestMapping(method = RequestMethod.POST)
	public void doInsert(@RequestBody Department department) {
		System.out.println(department);
		repo.save(department);

	}

	@PutMapping("/update-department")
	// @RequestMapping(method = RequestMethod.POST)
	public void doUpdate(@RequestBody Department department) {
		repo.save(department);

	}

	@DeleteMapping("/delete-department/{id}")
	public void doDelete(@PathVariable("id") int id) {
		repo.deleteById(id);

	}
	
	@GetMapping("/find-department/{id}")
	public Department doFind(@PathVariable("id") int id) {
		return repo.findById(id).get();

	}
	
	@GetMapping("/findall-department")
	public List<Department> doFind() {
		return (List<Department>) repo.findAll();

	}
	
	@GetMapping("/get-dept")
		public String getDepartment() {
			return "Data from department";
		}
	
	@GetMapping("/get-dept-details/{dno}")
	public String getDeptDetails(@PathVariable("dno") int dno) {
		Department d = repo.findById(dno).get();
		return d.getDeptId()+" "+ d.getDeptName();
	}
	}


