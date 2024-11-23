package com.gowtham.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gowtham.bean.Employee;
import com.gowtham.bean.Login;

@Controller
public class MyController {

	@RequestMapping("/welcome")
	public ModelAndView SayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");
		return mv;
	}

	@RequestMapping("/hello")
	public ModelAndView SayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}

	@RequestMapping("/employee")
	public ModelAndView loadEmployeeForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeForm");
		return mv;
	}

	@RequestMapping("/employee-data")
	public ModelAndView readEmployeeData(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeDetails");

		mv.addObject("emp", employee);

		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView loadLoginForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LoginForm");
		return mv;
	}

	@RequestMapping("/login-data")
	public ModelAndView readEmployeeData(@ModelAttribute("login") Login login) {
		ModelAndView mv = new ModelAndView();
		if (login.getName().equalsIgnoreCase("Admin") && login.getPassword() == 1234) {
			mv.addObject("log", login);
			mv.setViewName("LoginDetails");
			return mv;
		} else {
			mv.setViewName("LoginFail");
			return mv;
		}

	}

}
