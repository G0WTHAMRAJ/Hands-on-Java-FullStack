package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;
import com.ems.service.DepartmentService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "http://localhost:3000/")
public class EmployeeContoller {

	@Autowired
	private EmployeeRepo repo;
	
	@Autowired
	private DepartmentService departmentService;
	
	public EmployeeContoller(EmployeeRepo repo) {
		this.repo=repo;
	}
	
	@PostMapping("/create-employee")
	@PreAuthorize("hasRole('Role_Admin')")
	public void doInsert(@RequestBody Employee employee) {
		repo.save(employee);
	}

	@PutMapping("/update-employee")
	@PreAuthorize("hasRole('Role_Admin')")
	public void doUpdate(@RequestBody Employee employee) {
		repo.save(employee);

	}

	@DeleteMapping("/delete-employee/{empId}")
	public void doDelete(@PathVariable("empId") int empId) {
		repo.deleteById(empId);

	}
	@DeleteMapping("/delete-employee-name/{empName}")
	public void doDeleteByName(@PathVariable("empName") String empName) {
		repo.deleteByEmpName(empName);

	}
	@DeleteMapping("/delete-employee-salary/{empSalary}")
	public void doDeleteBySalary(@PathVariable("empSalary") int empSalary) {
		repo.deleteByEmpSalary(empSalary);

	}

	@GetMapping("/find-employee/{empId}")
	@PreAuthorize("hasRole('Role_Admin')or('User')")
	public Employee doFind(@PathVariable("empId") int empId) {
		return repo.findById(empId).get();
	}

	@GetMapping("/findAll-employee")
	public List<Employee> doFindAll() {
		return (List<Employee>) repo.findAll();

	}

	@GetMapping("/find-employee-name/{empName}")
	public List <Employee> doFindByName(@PathVariable("empName") String empName) {
		return repo.findByEmpName(empName);
	}

	@GetMapping("/find-employee-salary/{empSalary}")
	public List <Employee> doFindBySalary(@PathVariable("empSalary") int empSalary) {

		return repo.findByEmpSalary(empSalary);
	}
	
	@GetMapping("/get-department")
	public String getDepartment() {
		return departmentService.getDepartment();
		
	}
	
	

}
