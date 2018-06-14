package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.setter.Country;

public class Test2 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-setter.xml");
		Country c = (Country) context.getBean("c");
		c.display();

	}
}
