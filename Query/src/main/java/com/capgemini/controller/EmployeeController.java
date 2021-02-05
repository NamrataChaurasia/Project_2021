package com.capgemini.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.query.beans.Employee;
import com.capgemini.query.service.EmployeeServiceImplementation;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImplementation employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		EmployeeServiceImplementation employeeService = null;
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/employee/{empId}")
	public Optional<Employee> getEmployeeById(@PathVariable String empId)
	{
		EmployeeController employeeService = null;
		return employeeService.getEmployeeById(empId);
	}
	
	@GetMapping("/employeebyname/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name)
	{
		EmployeeServiceImplementation employeeService = null;
		return employeeService.getEmployeeByName(name);
	}
	
	@GetMapping("/employeebysalrange/{lower}/{higher}")
	public List<Employee> getEmployeeBySalaryRange(@PathVariable double lower,@PathVariable double higher)
	{
		EmployeeServiceImplementation employeeService = null;
		return employeeService.getEmployeesBySalRange(lower, higher);
	}
	
	@GetMapping("/employeebydesignation/{designation}")
	public List<Employee> getEmployeeByDesignation(@PathVariable String designation)
	{
		EmployeeController employeeService = null;
		return employeeService.getEmployeeByDesignation(designation);
	}
	
	
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee)
	{
		EmployeeController employeeService = null;
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee/{empId}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable String empId)
	{
		EmployeeController employeeService = null;
		employeeService.updateEmployee(employee, empId);
	}
	
	@DeleteMapping("/employee/{empId}")
	public void deleteEmployee(@PathVariable String empId)
	{
		EmployeeController employeeService = null;
		employeeService.deleteEmployee(empId);
	}

}
