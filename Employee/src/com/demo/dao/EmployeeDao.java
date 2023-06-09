package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean addEmployee();

	Set<Employee> displayAll();

	List<Employee> empByName(String name);

	boolean removeEmp(int id);
  
}
