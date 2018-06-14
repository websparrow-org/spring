package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Greet;

public class Hello {
	public static void main(String[] args) {

		// read XML file
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// create Greet object
		Greet gt = (Greet) context.getBean("sayHello");
		gt.welcome();

	}
}
