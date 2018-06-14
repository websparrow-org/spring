package org.websparrow.beans;

public class Employee {

	private String empName;
	private int empMobile;

	public Employee(String empName, int empMobile) {
		this.empName = empName;
		this.empMobile = empMobile;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpMobile() {
		return empMobile;
	}
}
