package com.demo.service;

import java.util.List;

import com.demo.entity.Employee;

public interface EmployeeService {
	

	boolean addEmp(Employee emp);
	
	Employee findEmpbyID(int empno);
	Employee findEmpbyname(String empname);
	
	List<Employee> findAllEmp();
	
	boolean updateEmp(Employee emp);
	
	boolean deleteEmp(int empno);

	

}
