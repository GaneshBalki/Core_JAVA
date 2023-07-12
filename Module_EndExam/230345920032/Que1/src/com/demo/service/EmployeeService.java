package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmp();

	List<Employee> showAllEmp();

	List<Employee> sortEmpbyId();

	List<Employee> showEmpByName(String empName);

	boolean removeEmpList();

	boolean saveAllEmpTOFile();

}
