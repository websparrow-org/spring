package org.websparrow.annotation.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

public class Employee {

	// Generate setters method...
	private String driver, url, user, password;

	private Connection con;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@PostConstruct
	public void conInit() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		System.out.println("Debug--> database connection opened...");
	}

	public void save(String name, String email, String dept, int salary) throws Exception {
		PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE_DETAILS VALUES(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, dept);
		ps.setInt(4, salary);
		ps.executeUpdate();
		System.out.println("Debug--> emplopyee records inserted...");
	}

	@PreDestroy
	public void conCleanUp() throws Exception {
		con.close();
		System.out.println("Debug--> database connection closed...");
	}

}
