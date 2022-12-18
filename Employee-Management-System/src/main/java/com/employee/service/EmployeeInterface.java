package com.employee.service;


import java.util.List;

import com.emoloyee.Employee;

public interface EmployeeInterface {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();


}
