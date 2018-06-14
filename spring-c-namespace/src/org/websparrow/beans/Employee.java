package org.websparrow.beans;

public class Employee {

	// Generate getters....
	private String empName;
	private int empSalary;

	public Employee(String empName, int empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

}
