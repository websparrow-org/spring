package org.websparrow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Bus;
import org.websparrow.beans.Car;
import org.websparrow.beans.Truck;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("............CAR...........");
		Car car = (Car) ap.getBean("car");
		System.out.println(car.myCarEngine().getName());

		System.out.println("............BUS...........");
		Bus bus = (Bus) ap.getBean("bus");
		System.out.println(bus.myBusEngine().getName());

		System.out.println("............TRUCK...........");
		Truck truck = (Truck) ap.getBean("truck");
		System.out.println(truck.myTruckEngine().getName());

	}
}
