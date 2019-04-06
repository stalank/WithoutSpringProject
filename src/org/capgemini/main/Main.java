package org.capgemini.main;

import org.capgemini.pojo.Employee;
import org.capgemini.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee();
		EmployeeService s = new EmployeeService();
		s.addEmployee(e);

	}

}
