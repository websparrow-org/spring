package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Employee;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.display();
		

	}
}
