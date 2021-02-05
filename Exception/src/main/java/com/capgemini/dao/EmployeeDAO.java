package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.beans.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, String> {

}