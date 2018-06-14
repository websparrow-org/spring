package org.websparrow.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Employee;

public class Hr {
	public static void main(String[] args) {

		// load the spring.xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Employee e = (Employee) context.getBean("emp");
		e.employeeDetails();

	}
}
