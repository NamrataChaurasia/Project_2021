package com.capgemini.query.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.query.beans.Employee;

public interface EmployeeService {
	  public List<Employee> getAllEmployee();

	  public Employee addEmployee(Employee employee);
	
	  public Optional<Employee> getEmployeeById(String empId);
	  
	  public List<Employee> getEmployeeByName(String name);
	  
	  public List<Employee> getEmployeeByDesignation(String designation);
	  
	  public List<Employee> getEmployeesBySalRange(double lower,double higher);

	  public void updateEmployee(String empId,Employee employee);

	  public void deleteEmployee(String empId);

}