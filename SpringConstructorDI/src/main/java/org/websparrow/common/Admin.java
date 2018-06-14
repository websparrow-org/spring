package org.websparrow.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Student;

public class Admin {
	
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
	    //ApplicationContext context = new ClassPathXmlApplicationContext("type-spring.xml");
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("index-spring.xml");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("name-spring.xml");

		Student stu = (Student) context.getBean("student");
		stu.studentReport();
	}
}
