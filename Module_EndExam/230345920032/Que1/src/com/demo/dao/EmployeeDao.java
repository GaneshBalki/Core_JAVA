package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {


	boolean addNewEmp(Employee e);

	List<Employee> getAllEmp();

	List<Employee> sortByID();

	List<Employee> getEmpByName(String empName);

	boolean removeEmpList();

	boolean writeFile();

}
