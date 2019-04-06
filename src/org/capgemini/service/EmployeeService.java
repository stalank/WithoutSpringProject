package org.capgemini.service;

import org.capgemini.dao.EmployeeDao;
import org.capgemini.pojo.Employee;

public class EmployeeService {
	EmployeeDao dao = new EmployeeDao();// EmployeeDao is dependency for
										// EmployeeService.......this dependency
										// will not be created if new keyword is
										// not used.Spring Framework should provide this dependency/..

	public void addEmployee(Employee e) {
		System.out.println("Employee Service is Called");
		dao.createEmployee(e);

	}
}
