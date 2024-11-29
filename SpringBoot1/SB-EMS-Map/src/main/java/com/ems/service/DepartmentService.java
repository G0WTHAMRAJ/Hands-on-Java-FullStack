package com.ems.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(url="http://localhost:1213",name="SB-DMS-PROJECT")
public interface DepartmentService {

	@GetMapping("/get-department")
	public String getDepartment() ;
	
	@GetMapping("/get-department-details/depId")
	public String getDepartmentDetails(@PathVariable("depId") int depId) ;
}
