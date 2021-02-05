package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployeeById(String empId);

	void addEmployee(Employee employee);

	void updateEmployee(String empId, Employee employee);

	void deleteEmployee(String empId);

}
