package com.other.test;

public class MakerClient {

	public static void main(String[] args) {
		
		Employee employee = new Employee.Builder().setName("test").setSalary("100").build();
		
		EmployeeMaker employeeMaker = new EmployeeMaker().addEmployee(employee);

	}

}
