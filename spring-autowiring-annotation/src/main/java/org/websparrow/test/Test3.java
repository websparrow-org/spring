package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.constructor.City;

public class Test3 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-constructor.xml");
		City c = (City) context.getBean("city");
		c.print();

	}
}
