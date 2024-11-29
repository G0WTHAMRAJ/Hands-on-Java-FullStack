package com.ems.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ems.model.Department;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer> {
	public List<Department> findByDeptName(String deptName);

	@Transactional
	public void deleteByDeptName(String EmpName);

}
