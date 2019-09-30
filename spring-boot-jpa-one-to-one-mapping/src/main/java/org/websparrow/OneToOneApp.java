package org.websparrow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.websparrow.entity.Employee;
import org.websparrow.entity.EmployeeDetails;
import org.websparrow.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneApp implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Create a new Employee
		Employee employee = new Employee("Sandeep", "Jaiswal", "sandeep@example.com");

		// Create Employee Detail
		EmployeeDetails employeeDetail = new EmployeeDetails("Database Architect", "Information Technology", "MALE",
				92000L, "London,UK");

		// Set child reference(employeeDetail) in parent entity(employee)
		employee.setEmployeeDetail(employeeDetail);

		// Set parent reference(employee) in child entity(employeeDetail)
		employeeDetail.setEmployee(employee);

		// Save in database
		employeeRepository.save(employee);

	}
}
