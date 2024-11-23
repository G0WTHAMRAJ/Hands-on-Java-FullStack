package com.ems.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.repo.EmployeeRepo;

@Controller
public class MyController {

	@Autowired
	private EmployeeRepo employeeRepo;

	@RequestMapping("/ems")
	public ModelAndView EmployeeForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeForm");
		return mv;
	}

	@RequestMapping(value = "employee-data")
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView();
		if (employee.getBtn().equalsIgnoreCase("Insert")) {

			if (employeeRepo.insertEmp(employee)) {
				mv.addObject("msg", employee.toString());
				mv.setViewName("Operation");
			}
		} else if (employee.getBtn().equalsIgnoreCase("delete")) {

			if (employeeRepo.deleteEmp(employee)) {
				mv.addObject("msg", "employee deleted successfully");
				mv.setViewName("Operation");

			}
		} else if (employee.getBtn().equalsIgnoreCase("update")) {

			if (employeeRepo.updateEmp(employee)) {
				mv.addObject("msg", "employee Updated successfully");
				mv.setViewName("Operation");

			}
		} else if (employee.getBtn().equalsIgnoreCase("find")) {
			Employee emp = employeeRepo.findEmp(employee.getEid());
			if (emp != null) {
				mv.addObject("msg", emp.toString());
				mv.setViewName("Operation");
			} 
		} else if(employee.getBtn().equalsIgnoreCase("findAll")) {
			List<Employee> employee1=employeeRepo.findAllEmp();
			if(employee1!=null) {
				mv.addObject("msg",employee1.toString());
				mv.setViewName("Operation");
			}
		}
		return mv;
	}

}
