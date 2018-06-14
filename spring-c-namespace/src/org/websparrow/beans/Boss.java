package org.websparrow.beans;

public class Boss {

	private String name;
	private String officeLocation;
	private Employee employee;

	// Parameterized constructor
	public Boss(String name, String officeLocation, Employee employee) {
		this.name = name;
		this.officeLocation = officeLocation;
		this.employee = employee;
	}

	// business logic
	public void display() {
		System.out.println("Boss and Employee details....\n");
		System.out.println("Boss name: " + name);
		System.out.println("Office Location: " + officeLocation);
		System.out.println("Employee name: " + employee.getEmpName());
		System.out.println("Employee salary: " + employee.getEmpSalary());
	}

}
