package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	// there is not required to write query here bz findByename(String ename) done the work for us
	// findByename --> B should be capital & ename is field through which we want to execute our query
	Employee findByename(String ename);

}
