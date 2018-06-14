package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.field.Country;

public class Test1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-field.xml");
		Country c = (Country) context.getBean("country");
		c.display();
	}
}
