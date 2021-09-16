package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emps_master")
public class Employee {
	@Id
	private int empno;
	@Column(length = 20)
	private String ename;
	@Column(length = 20)
	private String job;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empno, String ename, String job, double salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}
	public int getempno() {
		return empno;
	}
	public void setempno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
