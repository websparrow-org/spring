package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Teacher;

public class Principal {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Teacher tchr = (Teacher) context.getBean("newTeacher");
		tchr.display();
	}
}
