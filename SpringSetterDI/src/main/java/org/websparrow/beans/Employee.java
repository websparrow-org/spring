package org.websparrow.beans;

public class Employee {

	// generate setter methods of all variables.
	private String name;
	private String email;
	private int salary;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// business logic that actually uses the injected values.
	public void employeeDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Email: " + email);
		System.out.println("Employee Salary: " + salary);
	}

}
