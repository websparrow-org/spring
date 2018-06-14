package org.websparrow.beans;

public class Student {

	private String name;
	private int rollNumber;
	private String course;

	// String argument constructor
	public Student(String name) {
		this.name = name;
	}

	// Integer argument constructor
	public Student(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	// More than one argument constructor
	public Student(String name, int rollNumber, String course) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.course = course;
	}

	// Business logic that uses the injected value
	public void studentReport() {
		System.out.println("Student name: " + name);
		System.out.println("Student roll number: " + rollNumber);
		System.out.println("Student course: " + course);
	}
}
