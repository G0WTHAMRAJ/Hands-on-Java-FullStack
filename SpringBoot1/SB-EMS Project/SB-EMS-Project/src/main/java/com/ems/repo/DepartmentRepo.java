package com.ems.repo;

import org.springframework.data.repository.CrudRepository;

import com.ems.model.Department;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {

}
