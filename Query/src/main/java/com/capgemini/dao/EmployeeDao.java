package com.capgemini.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.query.beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee, String> {

	List<Employee> findByName(String name);

	List<Employee> findBySalaryBetween(double lower, double higher);
	
	List<Employee> findByDesignation(String designation);
	

	@Query("from Employee where name=:empName")
	List<Employee> getEmployeeDetailsByName(@Param("empName") String name);

	@Query("from Employee where salary>=:lower and salary<=:higher")
	List<Employee> getEmployeeDetailsBySalRange(@Param("lower") double lowsal, @Param("higher") double highsal);
	
	@Query("from Employee where designation=:empDesignation")
	List<Employee> getEmployeeDetailsByDesignation(@Param("empDesignation") String designation);


}
