package org.websparrow.programmatic.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

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

	// Initialization operation
	@Override
	public void afterPropertiesSet() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		System.out.println("Debug--> database connection opened...");
	}

	// Task perform operation
	public void save(String name, String email, String dept, int salary) throws Exception {

		PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE_DETAILS VALUES(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, dept);
		ps.setInt(4, salary);
		ps.executeUpdate();

		System.out.println("Debug--> emplopyee records inserted...");
	}

	// Clean up operation
	@Override
	public void destroy() throws Exception {
		con.close();
		System.out.println("Debug--> database connection closed...");
	}

}
