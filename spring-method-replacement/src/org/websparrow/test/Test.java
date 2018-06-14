package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Car;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");

		Car car = (Car) ap.getBean("car");
		car.design();
		car.breaks();
	}
}
