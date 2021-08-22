package com.other.test;

public class Employee {
	
	private String name; 
	private String salary;
	private String empId;
	private String address;
	
	 private Employee(Builder builder) {
		this.name = builder.name;
		this.salary = builder.salary;
		this.empId = builder.empId;
		this.address = builder.address;
	}

	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getAddress() {
		return address;
	}
	
	
	
	
	 @Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", empId=" + empId + ", address=" + address + "]";
	}




	static class Builder {
		private String name; 
		private String salary;
		private String empId;
		private String address;
		
		
		public Builder() {}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setSalary(String salary) {
			this.salary = salary;
			return this;
		}
		public Builder setEmpId(String empId) {
			this.empId = empId;
			return this;
		}
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
	}
		
}