package com.nitish.test;

public class EmployeeMaker {

	public EmployeeMaker() {}
	
	public EmployeeMaker(Employee employee) {
		System.out.println(employee);
	}

	
	EmployeeMaker addEmployee(Employee employee){
		return new EmployeeMaker(employee);
	}
	
}
