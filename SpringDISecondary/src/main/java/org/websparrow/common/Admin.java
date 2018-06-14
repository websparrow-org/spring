package org.websparrow.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Hr;

public class Admin {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("constructor-spring.xml");

		Hr hr = (Hr) context.getBean("h");
		hr.employeeDetails();
	}
}
