package org.websparrow.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Admin {

	public static void main(String[] args) {

		/*
		// Define all the bean configurations file in String array
		String[] configFile = { "teacher-spring.xml", "student-spring.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		
		// Or you can directly pass
		ApplicationContext contextNew = new ClassPathXmlApplicationContext("teacher-spring.xml", "student-spring.xml");
		*/
		
		ApplicationContext contextImport = new ClassPathXmlApplicationContext("admin-spring.xml");

	}
}
