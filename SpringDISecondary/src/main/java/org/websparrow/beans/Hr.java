package org.websparrow.beans;

public class Hr {

	private Employee emp; // secondary type
	private String empId; // primitive type

	public Hr(Employee emp, String empId) {
		this.emp = emp;
		this.empId = empId;
	}

	// business logic
	public void employeeDetails() {
		System.out.println("Employee id= " + empId);
		System.out.println("Employee name= " + emp.getEmpName());
		System.out.println("Employee mobile= " + emp.getEmpMobile());

	}
}
