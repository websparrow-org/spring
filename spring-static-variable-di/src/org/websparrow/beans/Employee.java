package org.websparrow.beans;

public class Employee {

	public static String empName;

	public static void setEmpName(String empName) {
		Employee.empName = empName;
	}

	public static void display() {
		System.out.println("Employee name is: " + empName);
	}

}
