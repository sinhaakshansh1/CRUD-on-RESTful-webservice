package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public boolean addEmp(Employee emp) {
		return empRepository.save(emp)!=null?true:false;
	}
	
	@Override
	public Employee findEmpbyID(int empno) {
		Optional<Employee> temp = empRepository.findById(empno);
		if(temp.isPresent()) {
			return temp.get();
		}
		else {
			return null;
		}
	}
	@Override
	public Employee findEmpbyname(String ename) {
		return empRepository.findByename(ename);
	}
	
	@Override
	public List<Employee> findAllEmp(){
		return empRepository.findAll();
	}
	@Override
	public boolean updateEmp(Employee emp) {
		if(findEmpbyID(emp.getempno())!=null) {
			return empRepository.save(emp)!=null?true:false;
		} else {
			return false;
		}
	}
	@Override
	 public boolean deleteEmp(int empno) {
		 if(findEmpbyID(empno)!=null) {
			 empRepository.deleteById(empno);
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
}
