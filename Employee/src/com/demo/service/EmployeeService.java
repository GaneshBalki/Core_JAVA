package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addEmployee();

	Set<Employee> displayAll();

	List<Employee> empByName(String name);

	boolean removeEmployee(int id);

}
